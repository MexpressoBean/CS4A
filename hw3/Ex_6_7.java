// Kevin Ramirez
// CS4A
// Ex 6.7 on pg. 235
// Description: Write a method that computes future investment value at a
//              given interest rate for a specified number of years.

import java.util.*;

public class Ex_6_7
{
  public static void main(String [] args)
  {
    final int numOfYears = 30;
    Scanner input = new Scanner(System.in);
    double investmentAmount = 0;
    double interestRate = 0;
    double monthlyInterestRate = 0;

    System.out.print("Please enter starting investment amount: $");
    investmentAmount = input.nextDouble();

    System.out.print("Please enter annual interest rate: %");
    interestRate = input.nextDouble();

    // Convert rate into proper decimal value for calculations
    interestRate = interestRate / 100;

    // Get monthly rate
    monthlyInterestRate = interestRate / 12.0;


    // Print table heading
    System.out.printf("%-10s %10s \n", "Years", "Future Value");

    // Print table with values
    for(int i = 1; i < numOfYears + 1; i++)
    {
      System.out.printf("%-10d %12.2f \n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
    }

  }// END main


  public static double futureInvestmentValue(double investmentAmount,
                                             double monthlyInterestRate,
                                             int years)
  {
    double futureAmount = 0;

    futureAmount = investmentAmount * Math.pow((1 + monthlyInterestRate),(years * 12));

    return futureAmount;
  }// END futureInvestmentValue

}
