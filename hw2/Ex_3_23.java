// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 3.23 from pg. 113 in chapter 3

import java.util.*;

public class Ex_3_23
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double x = 0;
    double y = 0;

		// Prompt the user to enter a point (x, y)
		System.out.print("Enter a coordinate pair for a point (x, y): ");
		 x = input.nextDouble();
		 y = input.nextDouble();

     if( (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2) )
     {
       System.out.printf("The point (%.1f, %.1f) is in the rectangle\n\n", x, y);
     }
     else
     {
       System.out.printf("The point (%.1f, %.1f) is not in the rectangle\n\n", x, y);
     }


  }
}
