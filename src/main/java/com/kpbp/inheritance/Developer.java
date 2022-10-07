package com.kpbp.inheritance;

import com.kpbp.OOPS.Employee;

public class Developer extends Employee {

    public double bonus;
    public double hra;

    public Developer(){
        bonus=10000;
        hra=8000;
    }
    public void printDeveloper(){
        super.empNo="515";
        super.empName="Kalyan";
        super.empAddress="BanaShankari";
        super.empCity="Bangalore";
        super.basicSalary=40000.00;
        super.printEmployee();
        System.out.println(bonus+"\n"+hra);
    }
}
