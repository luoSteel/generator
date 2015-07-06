package com.suse.edu.dao;

import com.suse.edu.bean.Myer;
import java.math.BigDecimal;

public interface MyerMapper {
    int deleteByPrimaryKey(BigDecimal dRecordId);

    int insert(Myer record);

    int insertSelective(Myer record);

    Myer selectByPrimaryKey(BigDecimal dRecordId);

    int updateByPrimaryKeySelective(Myer record);

    int updateByPrimaryKey(Myer record);
}