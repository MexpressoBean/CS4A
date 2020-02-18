// Kevin Ramirez
// CS4A
// Ex 6.2 on pg. 234
// Description: Write a method that computes the sum of the digits in an
// integer.

import java.util.*;

public class Ex_6_2
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    long number = 0;
    int sum = 0;

    System.out.print("Please enter a number: ");
    number = input.nextLong();

    sum = sumDigits(number);

    System.out.println("The sum of " + number + " is " + sum);

  } //END main


  public static int sumDigits(long n)
  {
    int sum = 0;
    int digit = 0;

    do
    {
      // Get the digit
      digit = (int)n % 10;

      // Add to the total sum
      sum += digit;

      // Position to the next digit
      n = (int)n / 10;

    }while(digit > 0);


    return sum;
  }
}
