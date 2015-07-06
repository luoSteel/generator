package com.suse.edu.dao;

import com.suse.edu.bean.Dict;

public interface DictMapper {
    int deleteByPrimaryKey(String valId);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(String valId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}