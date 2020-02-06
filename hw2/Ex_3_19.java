// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 3.19 from pg. 111 in chapter 3

// The input is valid if the sum of every pair of two edges
// is greater than the remaining edge.


import java.util.*;

public class Ex_3_19
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    double x3 = 0;
    double y3 = 0;
    double edge1 = 0;
    double edge2 = 0;
    double edge3 = 0;
    double perimeter = 0;
    Boolean isValid;

    System.out.print("Enter coordinate pair for first edge (x, y): ");
    x1 = input.nextDouble();
    y1 = input.nextDouble();

    System.out.print("Enter coordinate pair for second edge (x, y): ");
    x2 = input.nextDouble();
    y2 = input.nextDouble();

    System.out.print("Enter coordinate pair for third edge (x, y): ");
    x3 = input.nextDouble();
    y3 = input.nextDouble();

    // Determines if the input is valid
    isValid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) || (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) || (x2 + y2 > x1 + y1 && x3 + y3 > x1 + y1);

    if(isValid)
    {
      edge1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
  		edge2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
  		edge3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

      perimeter = edge1 + edge2 + edge3;

      System.out.printf("The perimeter of the triangle is: %.2f\n\n", perimeter);
    }
    else
    {
      System.out.println("The input is invalid");
    }

    input.close();
  }
}
