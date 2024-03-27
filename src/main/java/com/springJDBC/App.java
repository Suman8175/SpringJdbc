package com.springJDBC;

import com.springJDBC.implementinterface.Customer;
import com.springJDBC.implementinterface.InsertClass;
import com.springJDBC.implementinterface.InsertInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcconfig.xml");

        InsertInterface insertClass = (InsertInterface) context.getBean("insertClass");
        Customer customer=new Customer();
        customer.setCustomerName("Bhola");
        customer.setCustomerAddress("Gorkha");
        customer.setCustomerAge(48);
        int insert = insertClass.insert(customer);
        System.out.println("Inserted" +insert);
//        JdbcTemplate jdbcTemplate = context.getBean("jdbc-template", JdbcTemplate.class);
//        String query= "insert into customer(CustomerName,CustomerAddress,CustomerAge) values (?,?,?)";
//        int noOfRows = jdbcTemplate.update(query,"Sum","KTM",22);
//        if (noOfRows==1){
//            System.out.println("Inserted sucessfully");
//        }
//        else {
//            System.out.println("Failed to Insert");
//        }
    }
}
