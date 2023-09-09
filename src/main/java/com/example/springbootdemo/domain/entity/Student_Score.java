package com.example.springbootdemo.domain.entity;

import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 20:01
 **/
@Data
public class Student_Score {
    private Student student;
    private Score score;
    private Course course;
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student_Score that = (Student_Score) o;
        return Objects.equals(student, that.student) && Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, score);
    }

    @Override
    public String toString() {
        return "Student_Score{" +
                "student=" + student +
                ", score=" + score +
                '}';
    }
}
