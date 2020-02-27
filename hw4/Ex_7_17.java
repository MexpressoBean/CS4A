// Kevin Ramirez
// CS4A
// Ex 7.17 on pg. 279
// Description: Write a program that prompts the user to enter the number
// of students, the students’ names, and their scores, and prints student
// names in decreasing order of their scores.

import java.util.*;

public class Ex_7_17
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int numOfStudents = 0;
    // Enter the number of students
    System.out.print("Enter the number of students: ");
    numOfStudents = input.nextInt();

    // Create the parallel arrays
    String[] names = new String[numOfStudents];
    double[] scores = new double[names.length];


    for(int i = 0; i < names.length; i++)
    {
      // Input student name
      System.out.print("Enter Student #" + (i + 1) + " name: ");
      names[i]  = input.next();  // Why does nextLine not work

      // Input student score
      System.out.print("Enter the score: ");
      scores[i] = input.nextDouble();
    }

    // sorts the arrays
    sortArrays(names, scores);

    System.out.printf("\n  %-10s %12s \n","Name", "Score");
    System.out.print("--------------------------------------\n");

    for(int i = 0; i< names.length; i++)
    {
      System.out.printf("  %-10s %12.2f \n", names[i], scores[i]);
    }


      input.close();
  }



  // sorts the arrays
  public static void sortArrays(String[] names, double[] scores)
  {
    for (int i = 0; i < scores.length; i++)
    {
      String temp;
      double max = scores[i];
      int maxIndex = i;

      for (int j = i + 1; j < scores.length; j++)
      {
        if (scores[j] > max)
        {
          max = scores[j];
          maxIndex = j;
        }
      }

      if (maxIndex != i)
      {
        temp = names[i];
        names[i] = names[maxIndex];
        names[maxIndex] = temp;

        scores[maxIndex] = scores[i];
        scores[i] = max;
      }
    }
  }
}
