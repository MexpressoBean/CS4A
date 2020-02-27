// Kevin Ramirez
// CS4A
// Ex 7.18 on pg. 280
// Description: Write a sort method that uses the bubble-sort algorithm.
// The bubblesort algorithm makes several passes through the array.

import java.util.*;

public class Ex_7_18
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];

    System.out.print("Enter 10 numbers: ");

    for(int i = 0; i < array.length; i++)
    {
      array[i] = input.nextInt();
    }

    bubbleSort(array);

    System.out.print("\n\nSorted numbers: ");
    for(int i = 0; i < array.length; i++)
    {
      System.out.print(array[i] + " ");
    }

    System.out.print("\n\n");

  }


 public static void bubbleSort(int array[])
 {
   int n = array.length;
   for (int i = 0; i < n-1; i++)
   {
     for (int j = 0; j < n-i-1; j++)
     {
       if (array[j] > array[j+1])
       {
           // swap array[j+1] and array[i]
           int temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
       }
     }
   }
  }
}
