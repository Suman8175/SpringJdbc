package com.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("ps")
public class PersonAction implements CRUD{

@Autowired
    JdbcTemplate template=new JdbcTemplate();

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public int insert(Person person) {
        String query="insert into customer(CustomerName,CustomerAddress,CustomerAge) values(?,?,?)";
        int update = this.template.update(query, person.getPersonName(), person.getPersonAddress(), person.getPersonAge());
    return update;
    }

    @Override
    public int change(Person person) {
        String query="update customer set CustomerName=?,CustomerAddress=?,CustomerAge=? where CustomerId=?";
        int update = this.template.update(query, person.getPersonName(), person.getPersonAddress(), person.getPersonAge(), person.getPersonId());
        return update;
    }

    @Override
    public List<Person> fetchAllPerson() {
        String query="select * from customer";
        List<Person> personList = this.template.query(query, new SelectFetcher());
        return personList;
    }
}
