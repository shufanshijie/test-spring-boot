package com.gouhuo.boot.dao;

import com.gouhuo.boot.pojo.UserProductAuditStatusFail;
import com.gouhuo.boot.pojo.UserProductAuditStatusFailExample;

import java.util.List;

public interface UserProductAuditStatusFailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserProductAuditStatusFail record);

    int insertSelective(UserProductAuditStatusFail record);

    List<UserProductAuditStatusFail> selectByExample(UserProductAuditStatusFailExample example);

    UserProductAuditStatusFail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserProductAuditStatusFail record);

    int updateByPrimaryKey(UserProductAuditStatusFail record);
}