package by.jrr.jis4.classandobject.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class Person {

    static Logger logger = LoggerFactory.getLogger(Person.class);
    static int counter;
    int age;
    String name;
    String surName;
    String login;

    static{// static initializer
        counter = 10;
        System.out.println("static initializer");
    }
    { // instance initializer
        name = "default";
        System.out.println("instance initializer");
        System.out.println("total object " + counter);
    }

    public Person() {
        counter = counter + 1;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String surName, int age) {
        System.out.println("surname constructor");
        this.age = age;
        this.surName = surName;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        System.out.println("name constructor");
        this.age = age;
        this.name = name;
        {
            int i = 0;
            i = 3;
        }
    }

    public void sayName(boolean say) {
        if(!say) {
            return;
        }
        System.out.println("hello ");
        return;
    }


    public static int getCounter() {
        logger.info(" getCounter with no param");
        return counter;
    }
    public static int getCounter(Integer ofset) {
        logger.info(" getCounter with  param");
        return counter + ofset;
    }

    public void stackTraceDemo() {
        Human.callMom();
    }

}
