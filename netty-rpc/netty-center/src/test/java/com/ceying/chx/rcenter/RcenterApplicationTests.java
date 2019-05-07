package com.ceying.chx.rcenter;

import com.ceying.chx.rcenter.enums.RedisKeyEnums;
import com.ceying.chx.rcenter.redis.HessianRedisTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RcenterApplicationTests {

	@Autowired
	private HessianRedisTemplate hessianRedisTemplate;
	@Test
	public void contextLoads() {
//		String listKey= RedisKeyEnums.NOTIFYLISTKEY.getValue();
//		String notifyKey=RedisKeyEnums.NOTIFYVALUEKEY.getValue();
//		System.out.println( hessianRedisTemplate.opsForList().size(listKey));
//		String id= (String) hessianRedisTemplate.opsForList().leftPop(listKey);
//		hessianRedisTemplate.opsForList().rightPush(listKey,id);
//		System.out.println( hessianRedisTemplate.opsForList().size(listKey));
//		hessianRedisTemplate.opsForList().remove(listKey,1,id);
//		System.out.println( hessianRedisTemplate.opsForList().size(listKey));
	}

}
