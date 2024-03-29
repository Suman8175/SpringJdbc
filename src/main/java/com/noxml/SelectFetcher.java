package com.noxml;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectFetcher implements RowMapper {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person=new Person();
        person.setPersonId(rs.getInt(1));
        person.setPersonName(rs.getString(2));
        person.setPersonAddress(rs.getString(3));
        person.setPersonAge(rs.getInt(4));
        return person;
    }
}
