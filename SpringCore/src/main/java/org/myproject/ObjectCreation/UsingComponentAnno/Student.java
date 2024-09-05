package org.myproject.ObjectCreation.UsingComponentAnno;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Student Constructor");
    }

    @Override
    public String toString() {
        return "Student @" + Integer.toHexString(hashCode());
    }
}
