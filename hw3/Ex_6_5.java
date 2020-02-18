// Kevin Ramirez
// CS4A
// Ex 6.5 on pg. 234
// Description: Write a method with the following header to display
//              three numbers in increasing order:

import java.util.*;

public class Ex_6_5
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double num1 = 0;
    double num2 = 0;
    double num3 = 0;

    System.out.print("Enter three numbers: ");
    num1 = input.nextDouble();
    num2 = input.nextDouble();
    num3 = input.nextDouble();

    displaySortedNumbers(num1, num2, num3);
  }// END main


  public static void displaySortedNumbers( double num1, double num2, double num3)
  {
    final int AR_SIZE = 3;
    double[] numberAr = new double [AR_SIZE];

    numberAr[0] = num1;
    numberAr[1] = num2;
    numberAr[2] = num3;

    Arrays.sort(numberAr);

    System.out.println("Sorted Numbers:");

    for(int index = 0; index < AR_SIZE; index++)
    {
      System.out.print(numberAr[index] + "  ");
    }

    System.out.println(" ");
  }// END displaySortedNumbers
}
