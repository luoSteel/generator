package com.suse.edu.dao;

import com.suse.edu.bean.UserMessage;

public interface UserMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}