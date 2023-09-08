package com.example.springbootdemo.api.controller;

import com.example.springbootdemo.domain.entity.Person;
import com.example.springbootdemo.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 9:43
 **/
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/hello")
    public String test(){
        System.out.println("hello,world!");
        return "hello,world!";
    }

    @GetMapping("/id")
    public int id(int id){
        return id*100;
    }


    @PostMapping("/personToString")
    public String personToString(String name,String sex,int age){
        return personService.personBack(name,sex,age);
    }

    @PutMapping("/isMark")
    public Person isMark(String name,String sex,int age){
        return personService.isMark(name,sex,age);
    }

    @PostMapping("/jsonTest")
    public String jsonTest(@RequestBody Person person){
        return "jsonTest成功";
    }

    @DeleteMapping("/deleteMsg")
    public String deleteMsg(String name,String sex,int age){
        return name+"信息已删除";
    }

}
