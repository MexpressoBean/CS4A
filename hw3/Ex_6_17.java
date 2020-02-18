// Kevin Ramirez
// CS4A
// Ex 6.17 on pg. 238
// Description: Write a program that outputs a n-by-b matrix

import java.util.*;

public class Ex_6_17
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int size = 0; // Size for matrix is size-by-size

    System.out.print("Enter a size: ");
    size = input.nextInt();

    printMatrix(size);
  }


  public static void printMatrix(int n)
  {
    final int MAX = 1;
    final int MIN = 0;


    for(int i = 0; i < n; i++)
    {
      for(int y = 0; y < n; y++)
      {
        System.out.print(numGen(MAX, MIN) + "  ");
      }

      System.out.print("\n");
    }
  }


  public static int numGen(int max, int min)
  {
    int num = (int)(Math.random() * ((max - min) + 1)) + min;

    return num;
  }
}
