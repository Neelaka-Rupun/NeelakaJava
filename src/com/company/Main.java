package com.company;


import java.awt.event.KeyEvent;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int MONTH_IN_YEARS = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principle = 0;
        double intMontthlyIntrasRate = 0.0;
        int period = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Please enter the Principle :");
            principle = scanner.nextInt();
            if (principle >= 1000 && principle <= 1000000)
                break;
            System.out.println("Enter value between 1000 and 100000 ");
        }

        while (true) {
            System.out.print("Annual Interest Rate :");
            double intrestRate = scanner.nextDouble();
            if (intrestRate >= 1 && intrestRate <= 30) {
                intMontthlyIntrasRate = (intrestRate / MONTH_IN_YEARS) / PERCENT;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years) :");
            period = scanner.nextInt();
            if (period >= 1 && period <= 30) {
                numberOfPayments = period * MONTH_IN_YEARS;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double value = 1 + intMontthlyIntrasRate;

        double numerator = intMontthlyIntrasRate * (Math.pow(value, (double) numberOfPayments));

        double denominator = (Math.pow(value, (double) numberOfPayments)) - 1;

        double valueTobeMultiplyByPrinciple = numerator / denominator;

        double monatage = principle * valueTobeMultiplyByPrinciple;

        String currencyMonatage = NumberFormat.getCurrencyInstance().format(monatage);

        System.out.print("Montage :" + currencyMonatage);

//        //*FizzBuzz*//
//
//        System.out.println("Number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0) {
//            if (number % 3 == 0) {
//                System.out.println("FizzBUzz");
//            } else {
//                System.out.println("Fizz");
//            }
//        } else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(number);
//        }

//        String input = "";
//        while (true) {
//            System.out.println("Input :");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.next().toLowerCase();
//            if( input.equals("quit"))
//                break;
//            System.out.println(input);
//
//        }
//        String input = "";
//        do {
//            System.out.println("Input :");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        } while (!input.equals("quit"));

    }
}
