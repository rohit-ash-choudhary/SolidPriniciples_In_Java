package com.ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Employee is created ");
    }

    @Override
    public void delete(String client, int employeid) throws Exception {
        System.out.println("Employee is deleted ");
    }

    @Override
    public Employee getEmpl(String client, int employeid) throws Exception {
        System.out.println("This is employee details ");
        return new Employee();
    }
}
