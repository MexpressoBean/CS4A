// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 2.13 from pg. 72 in chapter 2

import java.util.*;

public class Ex_2_13
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    final int NUM_OF_MONTHS = 6;
    final double MONTHLY_INTEREST_RATE = 0.00417;
    double accountBalance = 0;
    double monthlySavingAmount = 0;


    System.out.print("Enter the monthly saving amount: ");
    monthlySavingAmount = input.nextDouble();

    // Calculation for the first month of interest
    accountBalance = monthlySavingAmount * (1 + MONTHLY_INTEREST_RATE);

    // Loop that calculates accountBalance for the remaining 5 months of interest
    for(int index = 0; index < (NUM_OF_MONTHS - 1); ++index)
    {
      accountBalance = (monthlySavingAmount + accountBalance) * (1 + MONTHLY_INTEREST_RATE);
    }


    // Set the accountBalance to show only 2 digits after the decimal
    accountBalance = (int)(accountBalance * 100)/100.0;


    System.out.println("After the sixth month, the account value is $" + accountBalance);
  }
}
