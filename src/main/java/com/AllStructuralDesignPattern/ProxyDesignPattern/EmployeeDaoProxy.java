package com.AllStructuralDesignPattern.DecoratorDesignPattern.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDAO{

    EmployeeDAO employeeDAOobj;
    EmployeeDaoProxy(){
        employeeDAOobj=new EmployeeDAOImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
       if(client.equals("Admin"))
       {
           employeeDAOobj.create(client,obj);
           return;
       }
       throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeid) throws Exception {
        if(client.equals("Admin"))
        {
            employeeDAOobj.delete(client,employeid);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee getEmpl(String client, int employeid) throws Exception {
        if(client.equals("Admin") || client.equals("User"))
        {
           return employeeDAOobj.getEmpl(client,employeid);
        }
        throw new Exception("Access Denied");
    }
}
