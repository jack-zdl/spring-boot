package com.ceying.flowable.modeler.extention.task.query;

/**
 * @author: fej
 * @date: 2018/5/30
 * @description :
 * @version: 2.0
 */
public class ProcessDefinitionQuery {

    private String name;
    private String processKey;
    private Integer version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessKey() {
        return processKey;
    }

    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
