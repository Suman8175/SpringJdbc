package com.noxml;

import java.util.List;

public interface CRUD {

    public int insert(Person person);
    public int change(Person person);
    public List<Person> fetchAllPerson();

}
