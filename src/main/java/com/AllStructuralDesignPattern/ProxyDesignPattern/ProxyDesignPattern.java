package com.AllStructuralDesignPattern.DecoratorDesignPattern.ProxyDesignPattern;

public class ProxyDesignPattern {

    public static void main(String[] args) throws Exception {
        EmployeeDAO   employeeDAO=new EmployeeDaoProxy();
        employeeDAO.create("ADMIN", new Employee());
        System.out.println("Operation Successfully");
    }
}
