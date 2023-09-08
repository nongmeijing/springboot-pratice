package com.example.springbootdemo.app.service;

import com.example.springbootdemo.domain.entity.Person;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 11:33
 **/
public interface PersonService {
    Person getPerson();
    String personBack(String name,String sex,int age);
    Person isMark(String name,String sex,int age);
}
