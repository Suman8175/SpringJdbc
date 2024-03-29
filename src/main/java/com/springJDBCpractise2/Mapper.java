package com.springJDBCpractise2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Mapper implements org.springframework.jdbc.core.RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee=new Employee();
        employee.setId(rs.getInt(1));
        employee.setName(rs.getString(2));
        employee.setAddress(rs.getString(3));
        employee.setAge((byte) rs.getInt(4));
        return employee;
    }
}
