package com.kpbp.accessmodifiers;

public class PrivateAccessModifierDemo {
    // Example for private access modifier: Within the same class only you will be able to access the members of the class (data members and methods)
    // If no access modifier is mentioned, it is considered as 'Default' - Scope of this within the class & package
    // Access modifier can be applied for the data members, methods, as well for the constructors.

    // Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    private int a;
    private int b;
    private int result;

    private void Addition() {
        result=a+b;
        //return result;
    }

    private void printResult() {

        System.out.println("The Result is: "+result);
    }

    private PrivateAccessModifierDemo() {

        a=100;
        b=200;
        result=0;
    }

    public static void main(String[] args) {

        PrivateAccessModifierDemo arithmeticOperations = new PrivateAccessModifierDemo();
        arithmeticOperations.a=600;
        arithmeticOperations.b=900;
        arithmeticOperations.Addition();
        arithmeticOperations.printResult();
    }

}
