package com.springJDBC.implementinterface;

import org.springframework.jdbc.core.JdbcTemplate;

public class InsertClass implements InsertInterface {

    private JdbcTemplate jdbcTemplate;

    public InsertClass(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Customer customer) {
        String query= "insert into customer(CustomerName,CustomerAddress,CustomerAge) values (?,?,?)";
        int ins = this.jdbcTemplate.update(query, customer.getCustomerName(),customer.getCustomerAddress(),customer.getCustomerAge());
        return ins;
    }
}
