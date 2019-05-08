package com.ceying.eagleeye.consumer.websocket;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ceying.common.base.CypRowSet;
import com.ceying.common.constant.WebsocketMsgTypeConstants;
import com.ceying.common.entity.MessageEntity;
import com.ceying.common.entity.UserLoginEntity;
import com.ceying.common.util.bean.SpringUtil;
import com.ceying.common.util.convert.ConvertApi;
import com.ceying.eagleeye.consumer.config.WebsocketConfig;
import com.ceying.eagleeye.consumer.service.MessageService;
import com.ceying.eagleeye.consumer.vo.MessageVo;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.session.SessionRepository;
import org.springframework.stereotype.Service;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * websocket 服务端
 * @author huanghaiyun
 * @createTime 2017年9月11日
 *
 */
@Service
public class WebSocketService extends WebSocketServer{
	@Autowired
	private ThreadPoolTaskExecutor myTaskExecutor;
	@Autowired
	private SessionRepository sessionRepository;
	@Autowired
	private MessageService messageService;
	/**
	 * 保存用户的 websocket链路信息
	 */
	private DualHashBidiMap userMap=new DualHashBidiMap();

	private static final Logger LOG =  LoggerFactory.getLogger(WebSocketService.class);

	@Autowired
	public WebSocketService(WebsocketConfig websocketConfig){
		super(new InetSocketAddress(websocketConfig.getPort()));//参数是 websocket服务的端口号
		this.start();
	}

	@Override
	public void onClose(WebSocket webScoket, int arg1, String arg2, boolean arg3) {
		LOG.debug("onClose:"+webScoket);
		userMap.removeValue(webScoket);
	}

	@Override
	public void onError(WebSocket webScoket, Exception e) {
		LOG.error("onError:",e);
	}

	@Override
	public void onMessage(WebSocket webScoket, String data) {
		try {
			JSONObject json=JSONObject.parseObject(data);
			UserLoginEntity user=sessionRepository.getSession(json.get("user").toString()).getAttribute("LOGINSUSER");
			String userId=user.getUserId();
			userMap.put(userId,webScoket);
			MessageVo vo=new MessageVo();
			vo.setUserid(userId);
			CypRowSet<MessageEntity> rowSet=messageService.listMsg(vo);
			LOG.debug(webScoket+":\t"+data);
			JSONObject jsonObject=rowSet.getJsonObject();
			jsonObject.put("type", WebsocketMsgTypeConstants.INIT);
			webScoket.send(JSONObject.toJSONString(jsonObject, SerializerFeature.WriteDateUseDateFormat));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onOpen(WebSocket webScoket, ClientHandshake arg1) {

		LOG.info("onOpen:"+webScoket);
	}
	public void sendMessage(MessageEntity entity) {
		String[] ids=entity.getUserid().split(",");
		for(String id:ids){
			WebSocket webSocket= (WebSocket) userMap.get(id);
			ConvertApi convertApi = SpringUtil.getBean(ConvertApi.class);
			List<MessageEntity> list=new ArrayList<>();
			list.add(entity);
			JSONObject jsonObject = convertApi.convertByAnnotation(list);
			jsonObject.put("type",WebsocketMsgTypeConstants.NOTIFY_ONE_MSG);
			if(webSocket!=null){
				webSocket.send(JSONObject.toJSONString(jsonObject,SerializerFeature.WriteDateUseDateFormat));
			}
		}
	}
	public void sendAll(String data) {
	    for(Object websocket:userMap.values()){
            ((WebSocket)websocket).send(data);
        }
	}
}
