package com.springJDBCpractise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MainRun {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
         InsertEmployee insertEmployee = context.getBean("employee",InsertEmployee.class);

//         Employee employee=new Employee();
//         employee.setName("Rajesh");
//         employee.setAddress("Mustang");
//         employee.setAge((byte) 44);
//         employee.setId(4);
//        int insertedData = insertEmployee.change(employee);
//        if (insertedData==1)
//            System.out.println("Inserted successfully");
//        else
//            System.out.println("Something went wrong");

//        Employee select = insertEmployee.select(44);
//        System.out.println(select);
        List<Employee> employees = insertEmployee.selectAllData();
       employees.forEach(n-> System.out.println(n));
    }
}
