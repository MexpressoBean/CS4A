// Kevin Ramirez
// CS4A
// Ex 18.11 on pg. 730
// Description: Write a recursive method that computes the sum of the
// digits in an integer.

import java.util.*;

public class Ex_18_11
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    long num = 0;
    int sum = 0;

    System.out.print("Enter a number: ");
    num = input.nextLong();

    sum = sumDigits(num);

    System.out.println("The sum of the digits in " + num + " is: " + sum);
  }

  public static int sumDigits(long n)
  {
    if(n == 0)
    {
      return 0;
    }
    else
    {
      return (int)(n % 10) + (int)sumDigits((n / 10));
    }
  }

  // Iterative Solution using do while loop
  // public static int sumDigits(long n)
  // {
  //   int sum = 0;
  //   int digit = 0;
  //
  //   do
  //   {
  //     // Get the digit
  //     digit = (int)n % 10;
  //
  //     // Add to the total sum
  //     sum += digit;
  //
  //     // Position to the next digit
  //     n = (int)n / 10;
  //
  //   }while(digit > 0);
  //
  //
  //   return sum;
  // }
}
