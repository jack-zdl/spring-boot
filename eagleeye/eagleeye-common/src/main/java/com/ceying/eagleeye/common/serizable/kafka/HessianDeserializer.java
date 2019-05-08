package com.ceying.eagleeye.common.serizable.kafka;

import com.caucho.hessian.io.HessianInput;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/5/14<br>
 * <br>
 */
public class HessianDeserializer implements Deserializer<Object> {

    private String encoding = "UTF8";
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        String propertyName = isKey ? "key.deserializer.encoding" : "value.deserializer.encoding";
        Object encodingValue = configs.get(propertyName);
        if (encodingValue == null) {
            encodingValue = configs.get("deserializer.encoding");
        }

        if (encodingValue != null && encodingValue instanceof String) {
            this.encoding = (String)encodingValue;
        }

    }

    @Override
    public Object deserialize(String s, byte[] bytes) {

        if(bytes==null) throw new NullPointerException();

        ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        HessianInput hi = new HessianInput(is);
        try {
            return hi.readObject();
        } catch (IOException e) {
            return new SerializationException(e);
        }
    }

    @Override
    public void close() {

    }
}
