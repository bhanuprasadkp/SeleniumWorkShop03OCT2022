package com.kpbp.accessmodifiers;

public class DefaultAccessModifierDemo {
    // Example for default access modifier: Within the same package, can be accessed across all classes.
    // If no access modifier is mentioned, it is considered as 'Default' - Scope of this within the class & package
    // Access modifier can be applied for the data members, methods, as well for the constructors.

    /* Default: The access level of a default modifier is only within the package.
    It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    */
    int a;
    int b;
    int result;

    void Addition() {
        result=a+b;
        //return result;
    }

    void printResult() {

        System.out.println("The Result is: "+result);
    }

    DefaultAccessModifierDemo() {

        a=250;
        b=250;
        result=0;
    }

    public static void main(String[] args) {

        DefaultAccessModifierDemo arithmeticOperations = new DefaultAccessModifierDemo();
        arithmeticOperations.a=515;
        arithmeticOperations.b=515;
        arithmeticOperations.Addition();
        arithmeticOperations.printResult();
    }

}
