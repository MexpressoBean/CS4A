// Kevin Ramirez
// CS4A
// Ex 6.6 on pg. 235
// Description: Write a method to display a pattern as follows:
//             1
//           2 1
//         3 2 1

import java.util.*;

public class Ex_6_6
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int numRows = 0;

    System.out.print("Enter desired number of rows: ");
    numRows = input.nextInt();

    displayPattern(numRows);

  } // END main


  public static void displayPattern(int n)
  {
    int spacing = n - 1;

    for (int rowI = 1; rowI <= n; rowI++)
    {
       for (int space = 0; space < spacing; space++)
       {
         System.out.print("  ");
       }

       for (int i = rowI; i > 0; i--)
       {
         System.out.print(i + " ");
       }


       System.out.print("\n");
       
       spacing--;
    }
  }// END displayPattern
}
