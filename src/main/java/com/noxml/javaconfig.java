package com.noxml;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.noxml"})
public class javaconfig {
    @Bean("prey")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ds.setUrl("jdbc:sqlserver://localhost;database=EShopping;encrypt=true;trustServerCertificate=true;");
        ds.setUsername("sa");
        ds.setPassword("password");
        return ds;
    }

    @Bean("template")
    public JdbcTemplate getJdbctemplate(){
        JdbcTemplate template=new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

//    @Bean("ps")
//    public PersonAction getPersonAction(){
//        PersonAction personAction=new PersonAction();
//        personAction.setTemplate(getJdbctemplate());
//        return personAction;
//    }
}
