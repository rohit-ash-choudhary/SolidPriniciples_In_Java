package com.AllStructuralDesignPattern.DecoratorDesignPattern.ProxyDesignPattern;

public interface EmployeeDAO {

    public void create(String client, Employee obj) throws Exception;
    public void delete(String client, int employeid) throws Exception;
    public Employee getEmpl(String client, int employeid) throws Exception;
}
