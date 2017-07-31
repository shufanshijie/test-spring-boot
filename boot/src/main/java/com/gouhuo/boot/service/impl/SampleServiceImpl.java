/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.gouhuo.boot.service.impl;

import com.gouhuo.boot.dao.UserProductAuditStatusFailMapper;
import com.gouhuo.boot.pojo.UserProductAuditStatusFail;
import com.gouhuo.boot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shangj
 * @version SampleServiceImpl, v0.1 2017/7/31 13:41
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private UserProductAuditStatusFailMapper mapper;

    @Override
    public void insert(UserProductAuditStatusFail fail) {
        mapper.insert(fail);
    }

    @Override
    public UserProductAuditStatusFail selectById(long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
