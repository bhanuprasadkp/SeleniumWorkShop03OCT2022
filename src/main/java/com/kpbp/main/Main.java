package com.kpbp.main;

// Can a project have multiple main function? Yes, but suggestion is to have one main class and call others as needed.
// Within a class, there should only be one main function in Core Java

import com.kpbp.inheritance.Developer;

public class Main {
    public static void main(String[] args){
        /*
        HelloWorld helloWorld = new HelloWorld();
        Address address = new Address();
        helloWorld.printHelloWorld();
        address.printAddress();
               */
        //ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    Developer obj1 = new Developer();
    obj1.printDeveloper();
    }

}
