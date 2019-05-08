package com.ceying.transaction.controller;

import com.ceying.transaction.constant.RedisConstants;
import com.ceying.transaction.treeData.TreeLink;
import com.ceying.transaction.util.RestTemplateClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/21<br>
 * <br>
 */
@RestController()
@RequestMapping("/transaction")
public class TransactionController {
    private static final Logger log = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private RedisTemplate<String, Object> cacheTemplate;
    @Autowired
    private RestTemplateClient restTemplateClient;
    /**
     * 整个 链路成功执行
     * @param treeId
     * @throws Exception
     */
    @RequestMapping("/success")
    public void success(String treeId) throws Exception {
        cacheTemplate.opsForHash().delete(RedisConstants.MYTRANSACTION,treeId);
    }
    /**
     * 获取回滚失败的 数据
     * @throws Exception
     */
    @RequestMapping("/listfail")
    public Object listFail() throws Exception {
        return  cacheTemplate.opsForHash().entries(RedisConstants.FAIlTRANSACTION).values();
    }
    /**
     * 获取正在执行 分布式事物的数据
     * @throws Exception
     */
    @RequestMapping("/listdoing")
    public Object list() throws Exception {
        return  cacheTemplate.opsForHash().entries(RedisConstants.MYTRANSACTION).values();
    }
    /**
     * 重新执行回滚
     * @throws Exception
     */
    @RequestMapping("/reRollback")
    public boolean reRollback(String treeId) throws Exception {
        TreeLink tree= (TreeLink) cacheTemplate.opsForHash().get(RedisConstants.FAIlTRANSACTION,treeId);
        cacheTemplate.opsForHash().delete(RedisConstants.FAIlTRANSACTION,treeId);
        if(tree!=null){
            try {
                rollBack(tree);
            } catch (Exception e) {
                log.error("回滚失败",e);
                cacheTemplate.opsForHash().put(RedisConstants.FAIlTRANSACTION,treeId,tree);
                return false;
            }
        }
        return true;

    }
    /**
     * 整个链路执行失败
     * @param treeId
     * @throws Exception
     */
    @RequestMapping("/fail")
    public void fail(String treeId) throws Exception {
        TreeLink tree= (TreeLink) cacheTemplate.opsForHash().get(RedisConstants.MYTRANSACTION,treeId);
        if(tree!=null){
            try {
                rollBack(tree);
            } catch (Exception e) {
                log.error("回滚失败",e);
                cacheTemplate.opsForHash().put(RedisConstants.FAIlTRANSACTION,treeId,tree);
            }
            cacheTemplate.opsForHash().delete(RedisConstants.MYTRANSACTION,treeId);
        }
    }

    /**
     * 对节点数据进行回滚
     * @param tree
     */
    private void rollBack(TreeLink tree){
        if(tree==null){
            return;
        }
        List<TreeLink> list=tree.getChildens();
        if(!list.isEmpty()){
            for(int i=list.size()-1;i>=0;i--){
                rollBack(list.get(i));
            }
        }
        if(!"root".equals(tree.getParentId())){//根节点 依靠 抛出的异常  通过spring transaction 自主回滚
            if(tree.getRollBack()&&tree.getSuccess()){//需要回滚并且feign 执行成功
                restTemplateClient.rollBack(tree);
                tree.setRollbackType(true);
            }

        }
    }

}
