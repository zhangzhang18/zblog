package com.zblog.dao;

import com.zblog.model.Discuss;
import com.zblog.model.DiscussKey;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussMapper {
    int deleteByPrimaryKey(DiscussKey key);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(DiscussKey key);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKeyWithBLOBs(Discuss record);

    int updateByPrimaryKey(Discuss record);
}