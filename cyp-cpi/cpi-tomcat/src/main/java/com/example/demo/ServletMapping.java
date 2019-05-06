package com.example.demo;

public class ServletMapping {

    private String servletName;
    private String url;
    private String clazz;

    public ServletMapping(String servletName, String url, String clazz) {
        this.servletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }

    public String getServleetName() {
        return servletName;
    }

    public String getUrl() {
        return url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setServleetName(String servleetName) {
        this.servletName = servleetName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
