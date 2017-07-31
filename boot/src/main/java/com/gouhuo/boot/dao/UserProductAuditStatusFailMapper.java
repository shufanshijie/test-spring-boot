package com.gouhuo.boot.dao;

import com.gouhuo.boot.pojo.UserProductAuditStatusFail;
import com.gouhuo.boot.pojo.UserProductAuditStatusFailExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserProductAuditStatusFailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserProductAuditStatusFail record);

    int insertSelective(UserProductAuditStatusFail record);

    List<UserProductAuditStatusFail> selectByExample(UserProductAuditStatusFailExample example);

    UserProductAuditStatusFail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserProductAuditStatusFail record);

    int updateByPrimaryKey(UserProductAuditStatusFail record);
}