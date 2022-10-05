package com.kpbp.OOPS;

import com.kpbp.accessmodifiers.ProtectedAccessModifierDemo;

public class SubtractionDemo extends ProtectedAccessModifierDemo {
    // Example for Protected Access Modifier Demo.
    /* Inheritance:
    Parent Class: ProtectedAccessModifierDemo
    Child Class:SubtractionDemo
     */

    public static void main(String[] args) {
        SubtractionDemo obj1 = new SubtractionDemo();
        obj1.a=515;
        obj1.b=600;
        obj1.subtraction();
        obj1.printResult();

    }

}
