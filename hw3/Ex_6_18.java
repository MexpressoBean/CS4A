// Kevin Ramirez
// CS4A
// Ex 6.18 on pg. 238
// Description: Write a program that checks a users password for the following:
//  - A password must have at least eight characters.
//  - A password consists of only letters and digits.
//  - A password must contain at least two digits.

import java.util.*;

public class Ex_6_18
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    String password = "";

    System.out.print("Enter password: ");
    password = input.nextLine();

    if(isValidPassword(password))
    {
      System.out.println("Password is valid.");
    }
    else
    {
      System.out.println("Password is invalid.");
    }
  }


  public static boolean isValidPassword(String password)
  {
    final int MIN_CHARACTERS = 8;
    final int MIN_DIGITS = 2;

    if(isMinChar(password, MIN_CHARACTERS) && isLetterOrNumber(password) && hasMinDigits(password, MIN_DIGITS))
    {
      return true;
    }
    else
    {
      return false;
    }
  }


  // Checks for minimum of 8 total characters
  public static boolean isMinChar(String password, int min)
  {
    if(password.length() >= min)
    {
      return true;
    }
    else
    {
      return false;
    }
  }


  // Checks for min of 2 digits
  public static boolean hasMinDigits(String password, int min)
  {
    int countDigits = 0;

    for(int i = 0; i < password.length(); i++)
    {
      if(Character.isDigit(password.charAt(i)))
      {
        countDigits++;
      }

      if(countDigits >= min)
      {
        return true;
      }
    }

    return false;
  }


  // Checks if the the password includes anyother characters other than letters or numbers
  public static boolean isLetterOrNumber(String password)
  {
    for(int i = 0; i < password.length(); i++)
    {
      if(!Character.isLetterOrDigit(password.charAt(i)))
      {
        return false;
      }

    }

    return true;
  }


}
