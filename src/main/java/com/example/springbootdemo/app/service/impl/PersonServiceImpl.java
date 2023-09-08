package com.example.springbootdemo.app.service.impl;

import com.example.springbootdemo.domain.entity.Person;
import com.example.springbootdemo.app.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 11:33
 **/
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person getPerson() {
        Person person=new Person();
        person.setName("张三");
        person.setSex("男");
        person.setAge(18);
        return person;
    }

    @Override
    public String personBack(String name,String sex,int age) {
        Person person=new Person();
        person.setName(name);
        person.setSex(sex);
        person.setAge(age);
        return person.toString();
    }

    @Override
    public Person isMark(String name, String sex, int age) {
        Person person=new Person();
        person.setName(name);
        person.setSex(sex);
        person.setAge(age);
        if (age>=18){
            person.setMark("已成年");
        }else {
            person.setMark("未成年");
        }
        return person;
    }


}
