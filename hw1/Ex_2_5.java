// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 2.5 from pg. 70 in chapter 2

import java.util.*;

public class Ex_2_5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double gratuityRate = 0;
    double gratuity = 0;
    double subtotal = 0;
    double total = 0;


    System.out.print("Enter the subtotal and a gratuity rate: ");
    subtotal = input.nextDouble();
    gratuityRate = input.nextDouble();


    gratuity = ((gratuityRate / 100) * subtotal);
    total = gratuity + subtotal;


    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

  }
}
