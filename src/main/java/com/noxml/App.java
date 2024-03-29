package com.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);

        Person person=new Person();
        person.setPersonId(1);
        person.setPersonName("Suman");
        person.setPersonAddress("India");
        person.setPersonAge(77);
        PersonAction ps = (PersonAction) context.getBean("ps");
//        int insert = ps.insert(person);
//        int change = ps.change(person);
        List<Person> people = ps.fetchAllPerson();
        people.forEach(n-> System.out.println(n));
        System.out.println("Inserted sucessfully");
    }
}
