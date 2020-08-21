package by.jrr.jis4.classandobject.bean;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void test() {
        boolean expected = true;
        boolean actual = true;

        assertEquals(expected, actual);
    }

    @Test
    public void sayNameTestShouldPrintName() {
        Person person = new Person();
        person.sayName(true);
    }

    @Test
    public void sayNameTestShouldNotPrintName() {
        Person person = new Person();
        person.sayName(false);
    }

    @Test
    public void defaultConstructorTest() {
        new Person();
    }

    @Test
    public void testStaticAndInitializers() {
        Person person1 = new Person();
        Person person2 = new Person();
        int i = Person.counter;
    }

    @Test
    public void accessFieldsAndMethods() {
        Person.counter = 20;
        Person.getCounter();

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Vladimir";
        person1.age = 32;
        person1.sayName(true);

        person2.name = "Max";
        person2.age = 35;
        person2.sayName(true);
    }

    @Test
    public void LVTI_Test() {
        var personList = new HashMap<String, List<Person>>();
        var person2 = new Person();
        int i = Person.getCounter();
        var strA = new String[]{"nsa", "nsa", "nsa", "nsa"};
        String[] strA2 = {"nsa", "nsa", "nsa", "nsa"};
        Person person = new Person();
        var person3 = person;
        for (var str : strA) {

        }
    }

    @Test
    public void constructorTest() {
        var person = new Person("max");
        assertEquals("max", person.name);

        var person2 = new Person(11);
        assertEquals(11, person2.age);

        new Person(11, "mac");
        new Person("mac", 11);
    }

    @Test
    public void overloading() {
        Person.getCounter();
        Person.getCounter(11);
        Person.getCounter(null); // throws NullPointerException on null.intValue()
    }

    @Test
    public void stackTraceDemoTest() {
        var p = new Person();
        p.stackTraceDemo();
    }

}
