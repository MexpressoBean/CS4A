// Kevin Ramirez
// CS4A
// Ex 7.3 on pg. 277
// Description: Write a program that reads the integers between 1 and 100
// and counts the occurrences of each. Assume the input ends with 0.

import java.util.*;

public class Ex_7_3
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[100];
    int count = 0;
    int number = 0;


    System.out.print("Enter the integers between 1 and 100: ");

    // Count occurences
    do
    {
      number = input.nextInt();

      if(number >= 1 && number <= 100)
      {
        arr[number]++;
      }

    }while(number != 0);

    // Display occurences
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > 0)
      {
        System.out.println(i + " occurs " + arr[i] + " time" + (arr[i] > 1 ? "s" : ""));
      }
    }


  }
}
