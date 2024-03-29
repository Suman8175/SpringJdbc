package com.springJDBCpractise2;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class InsertEmployee  implements Insert{
    private final JdbcTemplate jdbcTemplate;
    public InsertEmployee(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Employee employee) {
        String query="insert into customer(CustomerName,CustomerAddress,CustomerAge) values(?,?,?)";
        int update = this.jdbcTemplate.update(query, employee.getName(), employee.getAddress(), employee.getAge());
        return update;
    }

    @Override
    public int change(Employee employee) {
        String query="update  customer set CustomerName=?,CustomerAddress=?,CustomerAge=? where CustomerId=?";
        int update = this.jdbcTemplate.update(query, employee.getName(), employee.getAddress(), employee.getAge(),employee.getId());
        return update;
    }

    @Override
    public Employee select(int employeeId) {
        String query="select * from customer where CustomerAge=?";
        Mapper mapper=new Mapper();
        Employee employee = (Employee) this.jdbcTemplate.queryForObject(query, mapper, employeeId);
        return employee;
    }

    @Override
    public List<Employee> selectAllData() {
        String query="select * from Customer";
        List list = this.jdbcTemplate.query(query, new Mapper());
        return list;
    }
}
