// Kevin Ramirez
// CS4A
// Ex 8.4 on pg. 306
// Description: Suppose the weekly hours for all employees are stored
// in a two-dimensional array. Each row records an employ- ee’s seven-day work
// hours with seven columns. For example, the following array stores the work
// hours for eight employees. Write a program that displays employees and their
// total hours in decreasing order of the total hours.

import java.util.*;

public class Ex_8_4
{
  public static void main(String[] args)
  {
    int[][] employeeHours = { {2,4,3,4,5,8,8},
                              {7,3,4,3,3,4,4},
                              {3,3,4,3,3,2,2},
                              {9,3,4,7,3,4,1},
                              {3,5,4,3,6,3,8},
                              {3,4,4,6,3,4,4},
                              {3,7,4,8,3,8,4},
                              {6,3,5,9,2,7,9}};

    int[][] totalMatrix = sumRows(employeeHours);

    sortHours(totalMatrix);


    // Print out the totalMatrix
    System.out.printf("%-10s %12s \n", "Employee", "Hours");
    System.out.print("-----------------------------\n");

    for(int i = 0; i < totalMatrix.length; i++)
    {
      System.out.printf(" %-10d %9d \n", totalMatrix[i][0], totalMatrix[i][1]);
    }


  }// END main



  public static void sortHours(int[][] matrix)
  {
    for (int i = 0; i < matrix.length; i++)
    {
      // Two columns
      int maxCol0 = matrix[i][0];
      int maxCol1 = matrix[i][1];
      int maxIndex = i;

      for (int j = i + 1; j < matrix.length; j++)
      {
        if (maxCol1 < matrix[j][1]) {
          maxCol1 = matrix[j][1];
          maxCol0 = matrix[j][0];
          maxIndex = j;
        }
      }

      // Swap
      if (i != maxIndex)
      {
        matrix[maxIndex][1] = matrix[i][1];
        matrix[maxIndex][0] = matrix[i][0];
        matrix[i][1] =  maxCol1;
        matrix[i][0] =  maxCol0;
      }
    }
  }// END sort function


  public static int[][] sumRows(int[][] matrix)
  {
    int[][] totalRows = new int[matrix.length][2];

    for (int row = 0; row < matrix.length; row++)
    {
      totalRows[row][0] = row;
      totalRows[row][1] = 0;
      for (int col = 0; col < matrix[row].length; col++)
      {
        totalRows[row][1] += matrix[row][col];
      }
    }
    return totalRows;
  }


}
