// Kevin Ramirez
// CS4A
// Ex 18.16 on pg. 730
// Description: Write a recursive method to return the number of
// uppercase letters in an array of characters.

import java.util.*;

public class Ex_18_16
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    char[] chArray = {'A', 'b', 'c', 'D', 'e', 'f'};



    System.out.println("Array: ");
    for(int i = 0; i < chArray.length; i++)
    {
      System.out.print(chArray[i] + " ");
    }
    System.out.println();


    System.out.println("Uppercase Count: " + countUppercase(Arrays.toString(chArray)));

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
