package com.ceying.chx.rcenter.redis;

import com.alibaba.fastjson.JSONObject;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.util.Assert;

import java.nio.charset.Charset;

public class FastJsonRedisSerializer implements RedisSerializer<Object> {
    private final Charset charset;

    public FastJsonRedisSerializer() {
        this(Charset.forName("UTF8"));
    }

    public FastJsonRedisSerializer(Charset charset) {
        Assert.notNull(charset, "Charset must not be null!");
        this.charset = charset;
    }

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        return JSONObject.toJSONString(o).getBytes(charset);
    }

    public String deserialize(byte[] bytes) {
        return bytes == null?null:new String(bytes, this.charset);
    }

}