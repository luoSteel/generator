package com.suse.edu.dao;

import com.suse.edu.bean.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(String groupid);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(String groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}