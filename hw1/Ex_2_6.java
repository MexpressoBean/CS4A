// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 2.6 from pg. 70 in chapter 2

import java.util.*;

public class Ex_2_6
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int startingNumber = 0;
    int digit1 = 0;
    int digit2 = 0;
    int digit3 = 0;
    int sum = 0;

    System.out.print("Enter a number between 0 and 1000: ");
    startingNumber = input.nextInt();

    digit1 = (startingNumber % 1000)/100;

    digit2 = (startingNumber % 100)/10;

    digit3 = (startingNumber % 10);

    sum = digit1 + digit2 + digit3;

    System.out.println("The sum of the digits is " + sum);
  }
}
