// Kevin Ramirez
// CS4A
// Ex 6.35 on pg. 243
// Description: Write a program that computes the area of a pentagon

import java.util.*;

public class Ex_6_35
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double side = 0;
    double area = 0;


    System.out.print("Enter a side: ");
    side = input.nextDouble();

    area = area(side);

    System.out.println("The area of the pentagon is: " + area);
  }

  public static double area(double side)
  {
    double area = 0;

    area = ( (5) * Math.pow(side, 2) ) / ( 4 * Math.tan(Math.PI / 5) );

    return area;
  }


}
