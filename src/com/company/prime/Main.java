package com.company.prime;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Making a scanner
        Scanner keyboard = new Scanner(System.in);

        //pMax is the max number that the loop will run up to.
        System.out.println("What is your max number? ");
        int pMax = keyboard.nextInt(); // Max number entered by user
        int pMin = 0; // starting point
        int num = 0; // Num starting point
        num = pMin / 2;
        int flag = 0;
        String listOfPrimes = "";
        String notPrimes = "";

        for (pMin = 1; pMin <= pMax; pMin++) {
            int base = 0;
            for (num = pMin; num >= 1; num--) {
                for (num = pMin; num >= 1; num--) {
                    if (pMin % num == 0) {
                        base = base + 1;
                    }
                }
                if (base == 2) {
                    System.out.println("This is a prime " + pMin); // Code to see if it works
                    listOfPrimes = listOfPrimes + pMin + " ";
                } else {
                    System.out.println("This is not a prime " + pMin);
                    notPrimes = notPrimes + pMin + " ";
                }
            }
        }


        System.out.println("These are all the primes");
        System.out.println(listOfPrimes);
        System.out.println("These are all the numbers that are not primes");
        System.out.println(notPrimes);
    }
}






