package com.kpbp.OOPS;

public class Employee {

    protected String empNo;
    protected String empName;
    protected String empAddress;
    protected String empCity;
    protected double basicSalary;

    protected void printEmployee(){
        System.out.println(empNo+"\n"+empName+"\n"+empAddress+"\n"+empCity+"\n"+basicSalary);
    }

}
