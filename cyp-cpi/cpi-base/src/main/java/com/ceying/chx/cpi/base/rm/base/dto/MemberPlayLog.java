package com.ceying.chx.cpi.base.rm.base.dto;

import java.io.Serializable;
import java.util.Date;

public class MemberPlayLog implements Serializable {
    private String id;

    private String memberPhone;

    private String playId;

    private String businessId;

    private String couponType;

    private String couponId;

    private String payType;

    private String payState;

    private String appId;

    private String outTradeNo;

    private String outBizNo;

    private String buyerLogonId;

    private String sellerEmail;

    private String tradeStatus;

    private Double receiptAmount;

    private Double buyerPayAmount;

    private Double refundFee;

    private Date gmtPayment;

    private Date gmtRefund;

    private String dateContent;

    private String isactive;

    private Date createdAt;

    private Date updatedAt;

    private Integer rversion;

    private String description;

    private String content;

    private String moneyContent;

    private String headerContent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId == null ? null : playId.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo == null ? null : outBizNo.trim();
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId == null ? null : buyerLogonId.trim();
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail == null ? null : sellerEmail.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public Double getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Double getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(Double buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public Double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Double refundFee) {
        this.refundFee = refundFee;
    }

    public Date getGmtPayment() {
        return gmtPayment;
    }

    public void setGmtPayment(Date gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    public Date getGmtRefund() {
        return gmtRefund;
    }

    public void setGmtRefund(Date gmtRefund) {
        this.gmtRefund = gmtRefund;
    }

    public String getDateContent() {
        return dateContent;
    }

    public void setDateContent(String dateContent) {
        this.dateContent = dateContent == null ? null : dateContent.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getRversion() {
        return rversion;
    }

    public void setRversion(Integer rversion) {
        this.rversion = rversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMoneyContent() {
        return moneyContent;
    }

    public void setMoneyContent(String moneyContent) {
        this.moneyContent = moneyContent == null ? null : moneyContent.trim();
    }

    public String getHeaderContent() {
        return headerContent;
    }

    public void setHeaderContent(String headerContent) {
        this.headerContent = headerContent == null ? null : headerContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", playId=").append(playId);
        sb.append(", businessId=").append(businessId);
        sb.append(", couponType=").append(couponType);
        sb.append(", couponId=").append(couponId);
        sb.append(", payType=").append(payType);
        sb.append(", payState=").append(payState);
        sb.append(", appId=").append(appId);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", outBizNo=").append(outBizNo);
        sb.append(", buyerLogonId=").append(buyerLogonId);
        sb.append(", sellerEmail=").append(sellerEmail);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", receiptAmount=").append(receiptAmount);
        sb.append(", buyerPayAmount=").append(buyerPayAmount);
        sb.append(", refundFee=").append(refundFee);
        sb.append(", gmtPayment=").append(gmtPayment);
        sb.append(", gmtRefund=").append(gmtRefund);
        sb.append(", dateContent=").append(dateContent);
        sb.append(", isactive=").append(isactive);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", rversion=").append(rversion);
        sb.append(", description=").append(description);
        sb.append(", content=").append(content);
        sb.append(", moneyContent=").append(moneyContent);
        sb.append(", headerContent=").append(headerContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}