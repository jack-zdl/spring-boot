package com.ceying.chx.rcenter.redis;

import org.springframework.data.redis.connection.DefaultStringRedisConnection;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class HessianRedisTemplate extends RedisTemplate<String,Object> {
    public HessianRedisTemplate() {
        StringRedisSerializer stringSerializer = new StringRedisSerializer();
        HessianRedisSerializer hessianRedisSerializer = new HessianRedisSerializer();
        this.setKeySerializer(stringSerializer);
        this.setValueSerializer(hessianRedisSerializer);
        this.setHashKeySerializer(stringSerializer);
        this.setHashValueSerializer(hessianRedisSerializer);
    }

    public HessianRedisTemplate(RedisConnectionFactory connectionFactory) {
        this();
        this.setConnectionFactory(connectionFactory);
        this.afterPropertiesSet();
    }

    protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
        return new DefaultStringRedisConnection(connection);
    }
}