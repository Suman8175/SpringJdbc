package com.springJDBCpractise2;

import java.util.List;

public interface Insert {
    public int insert(Employee employee);
    public int change(Employee employee);

    public Employee select(int EmployeeId);
    public List<Employee> selectAllData();
}
