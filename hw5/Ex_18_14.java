// Kevin Ramirez
// CS4A
// Ex 18.14 on pg. 730
// Description: Write a recursive method to return the number of uppercase letters in a string.

import java.util.*;

public class Ex_18_14
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String inStr = "";

    System.out.print("Enter a string: ");
    inStr = input.nextLine();

    if(inStr != "")
    {
      System.out.println("Uppercase letter count: " + countUppercase(inStr));
    }

  }


  public static int countUppercase(String str)
  {
    int upperCaseCount = 0;

    int index = str.length() - 1;

    return countUppercaseHelper(str, index, upperCaseCount);
  }



  private static int countUppercaseHelper(String str, int index, int count)
  {
    if (index < 0) // Base case
    {
      return count;
    }
    else if (Character.isUpperCase(str.charAt(index)))
    {
      return countUppercaseHelper(str, index - 1, count + 1);
    }
    else
    {
      return countUppercaseHelper(str, index - 1, count);
    }
  }
}
