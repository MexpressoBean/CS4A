// Kevin Ramirez
// CS4A
// Ex 7.31 on pg. 283
// Description: Write the following method that merges two sorted lists
// into a new sorted list.

import java.util.*;

public class Ex_7_31
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] array1 = new int[6];
    int[] array2 = new int[4];
    int[] newAr = new int[(array1.length + array2.length)];

    // Input array1
    System.out.print("Enter 6 numbers in list 1: ");
    for(int i = 0; i < array1.length; i++)
    {
      array1[i] = input.nextInt();
    }



    // Input array2
    System.out.print("Enter 4 numbers in list 2: ");
    for(int i = 0; i < array2.length; i++)
    {
      array2[i] = input.nextInt();
    }



    // Merge the 2 arrays
    newAr = merge(array1, array2);

    // Sort the merged array
    bubbleSort(newAr);

    // Print the array
    System.out.print("\nThe merged list: ");

    for(int i = 0; i < newAr.length; i++)
    {
      System.out.print(newAr[i] + " ");
    }

    System.out.print("\n");

  } // END main




  // Takes 2 arrays and merges them together
  public static int[] merge(int[] list1, int[] list2)
  {
    int newArLength = list1.length + list2.length;
    int count = 0;
    int[] newAr = new int[newArLength];

    for(int i = 0; i < list1.length; i++)
    {
      newAr[i] = list1[i];
    }

    for(int i = list1.length; i < newAr.length ; i++)
    {
      newAr[i] = list2[i - list1.length];
    }

    return newAr;
  }


  // Sorts an int array
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
