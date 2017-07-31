/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.gouhuo.boot.service;

import com.gouhuo.boot.pojo.UserProductAuditStatusFail;

/**
 * @author shangj
 * @version SampleService, v0.1 2017/7/31 13:40
 */
public interface SampleService {

    void insert(UserProductAuditStatusFail fail);

    UserProductAuditStatusFail selectById(long id);
}
