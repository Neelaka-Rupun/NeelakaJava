package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         final int  MONTH_IN_YEARS = 12;
         final int  PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Principle :");
        String principle = scanner.nextLine().trim();

        System.out.print("Annual Interest Rate :");
        String  intrestRate = scanner.nextLine().trim();

        System.out.print("Period (Years) :");
        String  period = scanner.nextLine().trim();


        double intPrinciple                = Double.parseDouble(principle);
        double intMontthlyIntrasRate    = (Double.parseDouble(intrestRate)/MONTH_IN_YEARS)/PERCENT;


        int numberOfPayments = Integer.parseInt(period) * MONTH_IN_YEARS ;

        double value = 1 + intMontthlyIntrasRate;

        double numerator = intMontthlyIntrasRate*(Math.pow( value,(double)numberOfPayments));

        double denominator = (Math.pow(value,(double)numberOfPayments))-1;

        double valueTobeMultiplyByPrinciple = numerator/denominator;

        double monatage = intPrinciple * valueTobeMultiplyByPrinciple;

        String currencyMonatage = NumberFormat.getCurrencyInstance().format(monatage);

        System.out.print("Montage :" + currencyMonatage);
    }
}
