package com.suse.edu.dao;

import com.suse.edu.bean.Mday;
import java.math.BigDecimal;

public interface MdayMapper {
    int deleteByPrimaryKey(BigDecimal dRecordId);

    int insert(Mday record);

    int insertSelective(Mday record);

    Mday selectByPrimaryKey(BigDecimal dRecordId);

    int updateByPrimaryKeySelective(Mday record);

    int updateByPrimaryKey(Mday record);
}