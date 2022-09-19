package com.bridgelabz;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner( System.in );
            System.out.println("Enter a maxNumber: ");
            int maxNumber=scanner.nextInt();
            System.out.println("List of the prime number between 0 - " + maxNumber);
            for (int num = 0; num <= maxNumber; num++) {
                boolean isPrime = true;
                //initialize i=2
                //this for loop is checking if the number is divisible by any number starting from 2.
                for (int i = 2; i <= num / 2; i++) {
                    //num is divided by 2
                    //if condition is true then no is false
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true)
                    System.out.println(num);
            }
        }
    }

