package by.jrr.jis4.classandobject.service;

import by.jrr.jis4.classandobject.bean.Student;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentServiceTest {

    @Test
    public void studentServiceUtilTest() {
        var student = new Student();
        StudentServiceUtil.isAdult(student);
    }


    @Test
    public void studentServiceTest() {
        var student = new Student();
        var studentService = new StudentService(student);
        studentService.isAdult();
    }

    @Test
    public void whenStudentIsNotAdultShouldReturnFalse() {
        var student = new Student();
        student.setAge(19);
        boolean expected = false;
        boolean actual = StudentServiceUtil.isNotAdult(student);
        assertEquals(expected, actual);

    }
    @Test
    public void whenStudentIsNotAdultShouldReturnTrue() {
        var student = new Student();
        student.setAge(17);
        boolean expected = true;
        boolean actual = StudentServiceUtil.isNotAdult(student);
        assertEquals(expected, actual);

    }
    @Test
    public void whenStudentIs18ShouldReturnTrue() {
        var student = new Student();
        student.setAge(18);
        boolean expected = true;
        boolean actual = StudentServiceUtil.isNotAdult(student);
        assertEquals(expected, actual);

    }
}
