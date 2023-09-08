package com.example.springbootdemo.domain.repository.impl;

import com.example.springbootdemo.domain.entity.Student;
import com.example.springbootdemo.domain.repository.StudentRepository;
import com.example.springbootdemo.infra.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 17:02
 **/
@Service
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> allStudent(){
        return  studentMapper.allStudent();
    }

    @Override
    public List<Student> getStudent() {
        return studentMapper.getStudent();
    }

    @Override
    public int insertStudent(String name, String sex, Date birth,String sclass) {
        Student student=new Student();
        student.setSbirthday(birth);
        student.setSname(name);
        student.setSsex(sex);
        student.setSclass(sclass);
        return studentMapper.insert(student);
    }


}
