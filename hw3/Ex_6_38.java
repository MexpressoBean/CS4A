// Kevin Ramirez
// CS4A
// Ex 6.38 on pg. 244
// Description:

import java.util.*;

public class Ex_6_38
{
  public static void main(String [] args)
  {

    for(int i = 0; i < 10; i++)
    {
      // Print 100 uppercase letters, 10 per line
      for(int y = 0; y < 10; y++)
      {
        System.out.print(getRandomUpperCaseLetter() + " ");
      }
      System.out.print("\n");
    }

    // Print 100 digits, 10 per line
    for(int i = 0; i < 10; i++)
    {
      for(int y = 0; y < 10; y++)
      {
        System.out.print(getRandomDigitCharacter() + " ");
      }
      System.out.print("\n");
    }
  }


  public static char getRandomCharacter(char ch1, char ch2)
  {
    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
  }


  public static char getRandomLowerCaseLetter()
  {
    return getRandomCharacter('a', 'z');
  }


  public static char getRandomUpperCaseLetter()
  {
    return getRandomCharacter('A', 'Z');
  }


   public static char getRandomDigitCharacter()
   {
     return getRandomCharacter('0', '9');
   }

}
