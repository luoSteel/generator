package com.suse.edu.dao;

import com.suse.edu.bean.Mhou;
import java.math.BigDecimal;

public interface MhouMapper {
    int deleteByPrimaryKey(BigDecimal dRecordId);

    int insert(Mhou record);

    int insertSelective(Mhou record);

    Mhou selectByPrimaryKey(BigDecimal dRecordId);

    int updateByPrimaryKeySelective(Mhou record);

    int updateByPrimaryKey(Mhou record);
}