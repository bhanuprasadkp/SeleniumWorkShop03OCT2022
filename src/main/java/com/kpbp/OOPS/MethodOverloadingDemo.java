package com.kpbp.OOPS;

public class MethodOverloadingDemo {
    // Method Overloading is a POLYMORPHISM concept of OOPS
    int a;
    int b;
    int c;
    int d;
    int result;
    double result1;

    void addition(int a, int b){
        result=a+b;
    }

    void addition(int a, int b, int c){
        result=a+b+c;
    }

    void addition(int a, int b, int c, int d){
        result=a+b+c+d;
    }

    void addition(int a, double a1){
        result1=a+a1;
    }

    public void printResult(){
        System.out.println("The Result is: "+result);
    }

    public void printResult1(){
        System.out.println("The Result is: "+result1);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
        obj1.addition(12,18);
        obj1.printResult();

        obj1.addition(100, 99.99);
        obj1.printResult1();

        obj1.addition(1,2,3);
        obj1.printResult();

        obj1.addition(1,2,3,4);
        obj1.printResult();

    }

}
