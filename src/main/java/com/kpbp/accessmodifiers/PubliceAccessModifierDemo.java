package com.kpbp.accessmodifiers;

public class PubliceAccessModifierDemo {

    // Public access modifier demo
    /* Public: The access level of a public modifier is everywhere.
    It can be accessed from within the class, outside the class, within the package and outside the package. */
    public int a;
    public int b;
    public int result;

    public int multiplication(){
        result=a*b;
        return result;
    }

    public void printResult(){
        System.out.println("The Result is: "+result);
    }
}
