package com.kpbp.OOPS;

public class Address {
    // Data members
    String dNo;
    String street;
    String city;
    int pin;

    // Action on data members is called a Method

    public void printAddress(){

        System.out.println("Door Number: "+dNo+"\n"+"Street: "+street+"\n"+"City: "+city+"\n"+"PIN CODE: "+pin);
    }

    // Default Constructor (A method with its name same as that of its Class is called a Constructor). This is not a data member.
    public Address(){
        dNo= "28";
        street = "Sri Nagar Colony";
        city = "Hyderabad";
        pin = 500007;
    }

    // Parameterized Constructor
    public Address(String dNo, String street, String city, int pin){

       this.dNo = dNo;
       this.street = street;
       this.city= city;
       this.pin= pin;

    }
    public static void main(String[] args) {

        Address address = new Address();
        address.printAddress();
        System.out.print("\n");
        Address address1 = new Address("13", "DM", "TPT", 517501);
        System.out.print("\n");
        address1.printAddress();
        System.out.print("\n");
        address.printAddress();
        address.dNo="13";
        address.street="Jai Santosh Nagar";
        address.city="Hyderabad";
        address.pin=500007;
        System.out.print("\n");
        address.printAddress();

    }

}
