package by.jrr.jis4.classandobject.service;

import by.jrr.jis4.classandobject.bean.Student;

public class StudentServiceUtil {

    private StudentServiceUtil() {
    }

    public static boolean isAdult(Student student) {
        if(student.getAge() > 18) {
            return true;
        }
        return false;
    }


    public static boolean isNotAdult(Student student) {
        if(student.getAge() <= 18) {
            return true;
        }
        return false;
    }
}
