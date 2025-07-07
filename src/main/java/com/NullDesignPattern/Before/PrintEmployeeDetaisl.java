package com.NullDesignPattern.Before;

public class PrintEmployeeDetaisl {

     public void getEmployeeDetails(Employee emp){

         if (emp!=null) {
             System.out.println("Emp Name :" + emp.employee_name);
             System.out.println("Emp Details :" + emp.emloyee_detail);
         }

     }
}
