// Kevin Ramirez
// CS4A
// Ex 18.13 on pg. 730
// Description: Write a method that uses recursion to find the
// largest number in an array.

import java.util.*;

public class Ex_18_13
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    final int AR_SIZE = 8;
    int[] array = new int[AR_SIZE];
    int maxNum = 0;


    System.out.print("Enter 8 integers: ");
    for(int i = 0; i< AR_SIZE; i++)
    {
      array[i] = input.nextInt();
    }

    maxNum = findMax(array, AR_SIZE);

    System.out.println("Max num in the array is: " + maxNum);

  }


   public static int findMax(int a[], int n)
   {
     if(n == 1)
     {
       return a[0];
     }

     return Math.max(a[n-1], findMax(a, n-1));
   }
}
