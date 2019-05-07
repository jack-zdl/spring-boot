package com.ceying.chx.rcenter.redis;

import org.springframework.data.redis.connection.DefaultStringRedisConnection;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class FastJsonRedisTemplate extends RedisTemplate<String,Object> {
    public FastJsonRedisTemplate() {
        StringRedisSerializer stringSerializer = new StringRedisSerializer();
        FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer();
        this.setKeySerializer(stringSerializer);
        this.setValueSerializer(fastJsonRedisSerializer);
        this.setHashKeySerializer(stringSerializer);
        this.setHashValueSerializer(fastJsonRedisSerializer);
    }

    public FastJsonRedisTemplate(RedisConnectionFactory connectionFactory) {
        this();
        this.setConnectionFactory(connectionFactory);
        this.afterPropertiesSet();
    }

    protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
        return new DefaultStringRedisConnection(connection);
    }
}