package com.example.springbootdemo.api.controller;

import com.example.springbootdemo.domain.entity.Student;
import com.example.springbootdemo.domain.entity.Student_Score;
import com.example.springbootdemo.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    /**
     * mybatis练习，查询所有学生
     */
    @GetMapping("/allStudent")
    public List<Student> allStudent(){
        return studentRepository.allStudent();
    }

    /**
     * 根据Sno查询学生
     */
    @GetMapping("/selectBySno")
    public Student selectByPrimaryKey(String sno){
        return studentRepository.selectByPrimaryKey(sno);
    }

    /**
     * @return 多表查询，获取学生及其成绩
     */
    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return studentRepository.getStudent();
    }

    /**
     * 获取学生的课程以及相对应的成绩
     */
    @GetMapping("/getmark")
    public List<Student_Score> getmark(){
        return studentRepository.getmark();
    }

    /**
     * 新增学生
     */
    @PostMapping("/insertStudent")
    public int insertStudent(String name, String sex, String birth, String sclass) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = ft.parse(birth);
        System.out.println("date:"+date);
        return studentRepository.insertStudent(name,sex,date,sclass);
    }

    /**
     * 批量插入学生信息
     */
    @PostMapping("/insertStudents")
    public int insertStudents(List<Student> students) {
        return studentRepository.insertStudents(students);
    }

    /**
     * @return Thymeleaf练习，在页面上展示所有学生信息
     */
    @GetMapping("/showStudent")
    public ModelAndView showStudent(){
        List<Student> students=studentRepository.allStudent();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("students",students);
        modelAndView.setViewName("student");
        return modelAndView;
    }


    /**
     * @return Thymeleaf练习，跳转至新增学生页面
     */
    @GetMapping("/turnPage")
    public ModelAndView turnPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("student",new Student());
        modelAndView.setViewName("insertStudent");
        return modelAndView;
    }

    /**
     *  Thymeleaf练习，新增学生信息
     */
    @PostMapping("/insertStu")
    public ModelAndView insertStu(String sname,String ssex,String sclass,String sbirthday) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = ft.parse(sbirthday);
        studentRepository.insertStudent(sname,ssex,date,sclass);
        List<Student> students=studentRepository.allStudent();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("students",students);
        modelAndView.setViewName("student");
        return modelAndView;
    }


}
