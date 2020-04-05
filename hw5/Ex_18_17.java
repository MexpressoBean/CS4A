// Kevin Ramirez
// CS4A
// Ex 18.17 on pg. 730
// Description: Write a recursive method that finds the number of
// occurrences of a specified character in an array.

import java.util.*;

public class Ex_18_17
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    char[] chArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    char targetChr = 0;


    System.out.println("Array: ");
    for(int i = 0; i < chArray.length; i++)
    {
      System.out.print(chArray[i] + " ");
    }
    System.out.println();


    System.out.print("Enter the char to find: ");
    targetChr = input.next().charAt(0);


    System.out.println(targetChr + " count: " + count(chArray, targetChr));

  }

  public static int count(char[] chars, char ch)
  {
    return countHelper(chars, ch, chars.length - 1);
  }


  public static int countHelper(char[] chars, char ch, int high)
  {
    if (high < 0) // Base case
    {
      return 0;
    }
    else if (chars[high] == ch)
    {
      return 1 + countHelper(chars, ch, high - 1);
    }
    else
    {
      return countHelper(chars, ch, high - 1);
    }
  }
}
