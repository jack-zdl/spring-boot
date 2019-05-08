package com.ceying.eagleeye.common.serizable.kafka;

import com.caucho.hessian.io.HessianOutput;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/5/14<br>
 * <br>
 */
public class HessianSerializer implements Serializer<Object> {

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
    public byte[] serialize(String topic, Object data) {
        if(data==null) throw new NullPointerException();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        HessianOutput ho = new HessianOutput(os);
        try {
            ho.writeObject(data);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
        return os.toByteArray();
    }

    @Override
    public void close() {

    }

}
