package com.kpbp.accessmodifiers;

public class ProtectedAccessModifierDemo {

    // Protected Access Modifier Demo: Can be accessible from Other package using Inheritance
    /* Protected: The access level of a protected modifier is within the package and outside the package through child class.
    If you do not make the child class, it cannot be accessed from outside the package.*/
    protected int a;
    protected int b;
    protected int result;

    protected void subtraction(){
        result = a-b;
    }

    protected void printResult(){
    System.out.println("The Result is: "+result);
    }
}
