package com.example.springbootdemo.infra.mapper;

import com.example.springbootdemo.domain.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    int deleteByPrimaryKey(String cno);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String cno);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}