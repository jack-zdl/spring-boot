package com.ceying.chx.cpi.base.rm.base.dto;

import java.io.Serializable;
import java.util.Date;

public class MallSeckillOrder implements Serializable {
    private Integer id;

    private String mallGoodsId;

    private Integer totalStock;

    private Integer residueStock;

    private String isactive;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private Integer rversion;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallGoodsId() {
        return mallGoodsId;
    }

    public void setMallGoodsId(String mallGoodsId) {
        this.mallGoodsId = mallGoodsId == null ? null : mallGoodsId.trim();
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getResidueStock() {
        return residueStock;
    }

    public void setResidueStock(Integer residueStock) {
        this.residueStock = residueStock;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mallGoodsId=").append(mallGoodsId);
        sb.append(", totalStock=").append(totalStock);
        sb.append(", residueStock=").append(residueStock);
        sb.append(", isactive=").append(isactive);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", rversion=").append(rversion);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}