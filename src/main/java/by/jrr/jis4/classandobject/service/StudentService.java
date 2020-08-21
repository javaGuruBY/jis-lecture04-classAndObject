package by.jrr.jis4.classandobject.service;

import by.jrr.jis4.classandobject.bean.Student;

public class StudentService {

    private Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public boolean isAdult() {
        if(student.getAge() > 18) {
            return true;
        }
        return false;
    }


}
