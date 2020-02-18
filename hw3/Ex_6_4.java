// Kevin Ramirez
// CS4A
// Ex 6.4 on pg. 234
// Description: Write a method with the following header to display
//              an integer in reverse order:

import java.util.*;

public class Ex_6_4
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int number = 0;

    System.out.print("Please enter a number: ");
    number = input.nextInt();

    reverse(number);
  }

  public static void reverse(int number)
  {
    String strNum = number + "";
    String reversedNum = "";

    for(int i = strNum.length() - 1; i >= 0; i--)
    {
      reversedNum = reversedNum + strNum.charAt(i);
    }

    System.out.println(number + " in reverse is: " + Integer.parseInt(reversedNum));
  }
}
