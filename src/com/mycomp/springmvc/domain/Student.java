package com.mycomp.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String studentName;
    private Integer studentId;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
