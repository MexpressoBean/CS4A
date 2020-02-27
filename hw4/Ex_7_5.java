// Kevin Ramirez
// CS4A
// Ex 7.5 on pg. 277
// Description: Write a program that reads in ten numbers and
// displays the number of distinct numbers and the distinct numbers
// separated by exactly one space

import java.util.*;

public class Ex_7_5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
    int num = 0;


    System.out.print("Enter ten numbers: ");

    for(int i = 0; i < arr.length; i++)
    {
      num = input.nextInt();

      if(!(isFound(arr, num)))
      {
        arr[i] = num;
      }
    }


    System.out.print("The distinct numbers: ");

    for(int i = 0; i< arr.length; i++)
    {
      if(arr[i] != 0)
      {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.print("\n");
  }



  public static boolean isFound(int[] array, int num)
  {
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] == num)
      {
        return true;
      }
    }
    return false; // Default return
  }
}
