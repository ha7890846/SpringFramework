package org.myproject.ObjectCreation.UsingComponentAnno;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private String TeacherName;
    private int TeacherAge;
    public Teacher(){
        System.out.println("Teacher Constructor");
    }
    @Override
    public String toString() {
        return "Teacher @" + Integer.toHexString(hashCode());
    }
}
