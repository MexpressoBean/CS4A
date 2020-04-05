// Kevin Ramirez
// CS4A
// Ex 18.12 on pg. 730
// Description: Rewrite Programming Exercise 18.9 using a helper method to
// pass the substring high index to the method.

import java.util.*;

public class Ex_18_12
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String str = "";

    System.out.print("Enter a string: ");
    str = input.nextLine();

    reverseDisplay(str);
    System.out.print("\n");
  }

  public static void reverseDisplay(String value)
  {
    reverseDisplay(value, value.length() - 1);
  }


  public static void reverseDisplay(String value, int high)
  {
    if(high >= 0)
    {
      System.out.print((value.charAt(high)));
      reverseDisplay(value, high - 1);
    }
  }
}
