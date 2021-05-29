package com.shanedwilson;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

//        BankAccount bobsAccount = new BankAccount("12345", 0.0, "Bob Brown",
//                "myemail@bob.com", "111-222-3333");
        BankAccount bobsAccount = new BankAccount();
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("111-222-3333");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit((50.0));
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit((51.0));
        bobsAccount.withdrawal(100.0);

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "1234567890");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        VIPCustomer shane = new VIPCustomer("sdw", 25.00, "wilsonshaned@aol.com");
        System.out.println(shane.getName() + " " + shane.getCreditLimit() + " " + shane.getEmail());
    }


}
