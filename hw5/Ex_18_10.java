// Kevin Ramirez
// CS4A
// Ex 18.10 on pg. 730
// Description: Write a recursive method that finds the number of
// occurrences of a specified letter in a string.

import java.util.*;

public class Ex_18_10
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String strIn = "";
    char charIn = 0;
    int charCount = 0;

    System.out.print("Enter a string: ");
    strIn = input.nextLine();

    System.out.print("Enter a character: ");
    charIn = input.next().charAt(0);

    charCount = count(strIn, charIn);

    System.out.println(charIn + " is found " + charCount + " times in " + strIn);


  }


  public static int count(String str, char a)
  {
    if(str.length() == 0) // If the string has 0 characters then return 0
    {
      return 0;
    }
    else if (str.charAt(0) == a)
    {
      return 1 + count(str.substring(1), a);
    }
    else
    {
      return count(str.substring(1), a);
    }

  }
}
