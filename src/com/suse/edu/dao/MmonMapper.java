package com.suse.edu.dao;

import com.suse.edu.bean.Mmon;
import java.math.BigDecimal;

public interface MmonMapper {
    int deleteByPrimaryKey(BigDecimal dRecordId);

    int insert(Mmon record);

    int insertSelective(Mmon record);

    Mmon selectByPrimaryKey(BigDecimal dRecordId);

    int updateByPrimaryKeySelective(Mmon record);

    int updateByPrimaryKey(Mmon record);
}