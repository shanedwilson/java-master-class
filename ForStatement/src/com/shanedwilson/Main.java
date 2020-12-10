package com.shanedwilson;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10k at 2% = " + calculateInterest(10000.0,2.0));
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }

        for(double i = 2; i <9; i++) {
            double ir = calculateInterest(10000.0, i);
            System.out.println("10K at " + i + "% = " + ir);
        }

        for(double i = 8; i >=2; i-- ) {
            double ir = calculateInterest(10000.0, i);
            System.out.println("10K at " + i + "% = " + ir);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
