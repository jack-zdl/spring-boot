package com.ceying.chx.rcenter.protobuff.bean;

import com.ceying.chx.rcenter.bean.Response;


/**
 * @Author：huanghaiyun
 * @Date:2017/12/21
 */
public class ProtoResponse extends Response {

    private String resultType;

    public ProtoResponse(Long id) {
        super(id);
    }
    public ProtoResponse() {
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

}
