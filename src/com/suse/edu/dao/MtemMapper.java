package com.suse.edu.dao;

import com.suse.edu.bean.Mtem;
import java.math.BigDecimal;

public interface MtemMapper {
    int deleteByPrimaryKey(BigDecimal dRecordId);

    int insert(Mtem record);

    int insertSelective(Mtem record);

    Mtem selectByPrimaryKey(BigDecimal dRecordId);

    int updateByPrimaryKeySelective(Mtem record);

    int updateByPrimaryKey(Mtem record);
}