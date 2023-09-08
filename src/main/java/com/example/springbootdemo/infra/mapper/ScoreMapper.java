package com.example.springbootdemo.infra.mapper;

import com.example.springbootdemo.domain.entity.Score;
import com.example.springbootdemo.domain.entity.ScoreKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    int deleteByPrimaryKey(ScoreKey key);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}