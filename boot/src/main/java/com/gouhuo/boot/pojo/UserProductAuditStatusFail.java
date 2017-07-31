package com.gouhuo.boot.pojo;

import java.util.Date;

public class UserProductAuditStatusFail {
    private Long id;

    private Long userId;

    private Integer auditStatus;

    private Long productAuditId;

    private Integer productId;

    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getProductAuditId() {
        return productAuditId;
    }

    public void setProductAuditId(Long productAuditId) {
        this.productAuditId = productAuditId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}