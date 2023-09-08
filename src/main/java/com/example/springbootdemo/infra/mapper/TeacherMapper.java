package com.example.springbootdemo.infra.mapper;

import com.example.springbootdemo.domain.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String tno);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}