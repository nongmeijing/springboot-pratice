package com.example.springbootdemo.infra.mapper;

import com.example.springbootdemo.domain.entity.Student;
import com.example.springbootdemo.domain.entity.Student_Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> allStudent();

    List<Student> getStudent();

    int insertStudents(List<Student> students);

    List<Student_Score> getmark();

}