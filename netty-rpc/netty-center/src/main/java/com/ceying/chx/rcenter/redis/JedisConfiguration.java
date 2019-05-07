package com.ceying.chx.rcenter.redis;

import com.ceying.chx.rcenter.config.JedisConfig;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.lang.reflect.Method;

/**
 * @Author：huanghaiyun
 * @Date:2017/12/18
 */
@Configuration
public class JedisConfiguration {
    @Autowired
    private JedisConfig redisConfig;

    @Bean
    public JedisConnectionFactory convertJedisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(redisConfig.getHost());
        jedisConnectionFactory.setPort(redisConfig.getPort());
        jedisConnectionFactory.setPassword(redisConfig.getPassword());

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(redisConfig.getMaxTotal());
        jedisPoolConfig.setMaxIdle(redisConfig.getMaxIdle());
        jedisPoolConfig.setMaxWaitMillis(redisConfig.getMaxWaitMillis());
        jedisPoolConfig.setTestOnBorrow(redisConfig.isTestOnBorrow());
        jedisPoolConfig.setTestOnReturn(redisConfig.isTestOnReturn());
        jedisPoolConfig.setTestWhileIdle(redisConfig.isTestWhileIdle());

        jedisConnectionFactory.setPoolConfig(jedisPoolConfig);
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }

    @Bean(name = "stringRedisTemplate")
    public StringRedisTemplate convertStringRedisTemplate() {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(convertJedisConnectionFactory());
        return stringRedisTemplate;
    }

    @Bean(name = "fastJsonRedisTemplate")
    public FastJsonRedisTemplate fastJsonRedisTemplate() {
        FastJsonRedisTemplate stringRedisTemplate = new FastJsonRedisTemplate(convertJedisConnectionFactory());
        return stringRedisTemplate;
    }

    @Bean(name = "hessianRedisTemplate")
    public HessianRedisTemplate hessianRedisTemplate() {
        HessianRedisTemplate hessianRedisTemplate = new HessianRedisTemplate(convertJedisConnectionFactory());
        return hessianRedisTemplate;
    }
    @Bean
    public KeyGenerator wiselyKeyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for (Object obj : params) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };

    }

    @Bean
    public CacheManager cacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        return cacheManager;
    }


}
