package com.example.springbootdemo.domain.repository;

import com.example.springbootdemo.domain.entity.Student;
import com.example.springbootdemo.domain.entity.Student_Score;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 17:01
 **/
public interface StudentRepository {

    List<Student> allStudent();
    List<Student> getStudent();
    int insertStudent(String name, String sex, Date birth, String sclass);
    Student selectByPrimaryKey(String sno);
    List<Student_Score> getmark();
    int insertStudents(List<Student> students);
}
