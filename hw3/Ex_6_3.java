// Kevin Ramirez
// CS4A
// Ex 6.3 on pg. 234
// Description: Use the reverse method to implement isPalindrome. A number is
//              a palin- drome if its reversal is the same as itself.

import java.util.*;

public class Ex_6_3
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int number = 0;
    boolean palindrome = false;

    System.out.print("Please enter a number: ");
    number = input.nextInt();

    palindrome = isPalindrome(number);

    if(palindrome)
    {
      System.out.println(number + " is a palindrome.");
    }
    else
    {
      System.out.println(number + " is NOT a palindrome.");
    }
  }


  public static int reverse(int number)
  {
    String strNum = number + "";
    String reversedNum = "";

    for(int i = strNum.length() - 1; i >= 0; i--)
    {
      reversedNum = reversedNum + strNum.charAt(i);
    }

    return Integer.parseInt(reversedNum);
  }


  public static boolean isPalindrome(int number)
  {
    if(number == reverse(number))
    {
        return true;
    }
    else
    {
        return false;
    }
  }
}
