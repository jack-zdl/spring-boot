package com.ceying.chx.cpi.base.rm.org.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.exception.RedisConnectException;
import com.ceying.chx.cpi.base.rm.org.dao.OrgDao;
import com.ceying.chx.cpi.base.rm.org.entity.OrganizationEntity;
import com.ceying.chx.cpi.base.rm.org.service.OrgService;
import com.ceying.chx.cpi.base.util.redis.RedisUtils;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * 功能说明: 组织的service实现类<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/9 11:06<br>
 * <br>
 */

@Service
public class OrgServiceImpl implements  OrgService{  //implements UserDetailsService ,


    @Resource
    private OrgDao orgDao;

    @Resource
    private RedisUtils redisUtils;

    @Override
    public RespJson list() throws ParamException, RedisConnectException {
        List<OrganizationEntity> orgList = orgDao.list();
        Map<String,Object> map = new HashMap<String,Object>();
        JSONObject param = new JSONObject();
        param.put("admin","admin");
        param.put("admin1","admin");
        param.put("admin2","admin");
        map.put("zdl",param);
        redisUtils.save(map,0);
        return RespJsonFactory.buildSuccess(orgList) ;
    }

    @Override
    public
    RespJson get() {
        return null;
    }

//    @Override
//    public
//    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = new User();
//        long userId = 1;
//        String username = "";
//        String password = "";
//        Boolean enabled = false;
//        Boolean accountNonExpired = false;
//        Boolean credentialsNonExpired = false;
//        Boolean accountNonLocked = false;
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("admin"));
//        user.setUserId("admin");
//        if (user == null) {
//            throw new UsernameNotFoundException("用户名不存在");
//        }
////        UserDetails userDetails = new JWTUserDetails(userId, username, password,
////                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, null);
//        UserDetails userDetails = new org.springframework.security.core.userdetails.User(username,
//                password, authorities);
//        return userDetails;
//    }

}
