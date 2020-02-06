// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 3.27 from pg. 114 in chapter 3
import java.util.*;

public class Ex_3_27
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double x = 0;
    double y = 0;
    double inX = 0;
    double inY = 0;

    System.out.print("Enter a point (x, y): ");
    x = input.nextDouble();
    y = input.nextDouble();


    inX = (-x * (200 * 100)) / (-y * 200 - x * 100);
    inY = (-y * (200 * 100)) / (-y * 200 - x * 100);

    if(x > inX || y > inY)
    {
      System.out.println("The point is not in the triangle");
    }
    else
    {
      System.out.println("The point is in the triangle");
    }


  }
}
