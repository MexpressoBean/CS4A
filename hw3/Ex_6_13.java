// Kevin Ramirez
// CS4A
// Ex 6.13 on pg. 237
// Description: Write a method that computes the following series:
//              i/(i + 1)

import java.util.*;

public class Ex_6_13
{
  public static void main(String [] args)
  {
    final int ITERATIONS = 20;

    computeSeries(ITERATIONS);

  }

  // Computes single interation of the series
  public static double computeFormula(int i)
  {
    double result = 0;

    result = i / (i + 1.0);

    return result;
  }

  // Computes entire series and prints table
  public static void computeSeries(int iterations)
  {
    double sum = 0;

    System.out.printf("%-12s %-12s \n", "i", "m(i)");
    System.out.println("----------------------------");

    for(int i = 1; i < iterations + 1; i++)
    {
      sum += computeFormula(i);

      System.out.printf("%-12d %10.4f \n", i, sum);
    }
  }
}
//
