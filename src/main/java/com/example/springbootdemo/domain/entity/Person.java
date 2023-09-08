package com.example.springbootdemo.domain.entity;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 15:43
 **/
public class Person {
    private String name;
    private String sex;
    private Integer age;
    private String Mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", Mark='" + Mark + '\'' +
                '}';
    }
}
