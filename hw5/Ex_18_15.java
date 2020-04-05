// Kevin Ramirez
// CS4A
// Ex 18.15 on pg. 730
// Description: Rewrite Programming Exercise 18.10 using a helper method to
// pass the substring high index to the method.

import java.util.*;

public class Ex_18_15
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String inStr = "";
    char inChar = 0;

    System.out.print("Enter a string: ");
    inStr = input.nextLine();

    System.out.print("Enter a character: ");
    inChar = input.next().charAt(0);

    System.out.println(inChar + " count: " + count(inStr, inChar));

  }


	public static int count(String str, char a)
  {
		return countHelper(str, a, str.length() - 1);
	}


	private static int countHelper(String str, char a, int high) {
		if (high < 0) // Base case
    {
      return 0;
    }
		else if (str.charAt(high) ==  a)
    {
			return 1 + countHelper(str, a, high - 1);
		}
		else
    {
      return countHelper(str, a, high - 1);
    }
	}
}
