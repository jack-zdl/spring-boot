package com.ceying.chx.cpi.customer.rm.accountspayable.entity;

import java.io.Serializable;

/**
 * Created by cyp on 2017/12/4.
 */
public class AccountsInfoDto implements Serializable{

    private String id;

    private String name;

    private String imageurl;

    private String url;

    private String currency;

    private String siteprice;

    private String marketprice;

    private String category;

    private String brand;

    private String custom1;

    private String custom2;

    public AccountsInfoDto(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSiteprice() {
        return siteprice;
    }

    public void setSiteprice(String siteprice) {
        this.siteprice = siteprice;
    }

    public String getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(String marketprice) {
        this.marketprice = marketprice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }
}
