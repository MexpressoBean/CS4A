// Kevin Ramirez
// CS4A
// Ex 8.14 on pg. 310
// Description: Write a program that prompts the user to enter the length of
// a square matrix, randomly fills in 0s and 1s into the matrix, prints the
// matrix, and finds the rows, columns, and diagonals with all 0s or 1s.

import java.util.*;

public class Ex_8_14
{
	public static void main(String[] args)
  {
		int[][] matrix = getMatrix();

		print(matrix);

		int[] rows = allRow(matrix);
		int count = 0;


		for (int i = 0; i < rows.length; i++)
    {
			if (rows[i] >= 0)
      {
				System.out.println("All " + rows[i] + "s on row " + (i + 1));
      }
			else
      {
				count++;
      }
			if (count == rows.length)
      {
				System.out.println("No same numbers on a row");
      }
		}

		int[] columns = allColumn(matrix);

		count = 0;

		for (int i = 0; i < columns.length; i++)
    {
			if (columns[i] >= 0)
      {
  			System.out.println("All " + columns[i] + "s on column " + (i + 1));
      }
			else
      {
				count++;
      }
			if (count == columns.length)
      {
				System.out.println("No same numbers on a column");
      }
		}

		int num = allMajorDiagonal(matrix);

		switch (num)
    {
			case 0:
			case 1: System.out.println("All " + num + "s on the major diagonal");
			break;
			default: System.out.println("No same numbers on the major diagonal");
		}

		num = allSubDiagonal(matrix);

		switch (num)
    {
			case 0:
			case 1: System.out.println("All " + num + "s on the sub-diagonal");
			break;
			default: System.out.println("No same numbers on the sub-diagonal");

		}
	}// END main



	public static int allSubDiagonal(int[][] matrix)
  {
		int[] count = new int[2]; // Counts 0s and 1s

    // Reset the array
		count[0] = 0;
		count[1] = 0;

		for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--)
    {
			count[matrix[i][j]]++;

			if (count[0] == matrix.length)
      {
				return 0;
      }
			if (count[1] == matrix.length)
      {
				return 1;
      }
		}
		return -1;
	}



	public static int allMajorDiagonal(int[][] matrix)
  {
		int[] count = new int[2];

		count[0] = 0;
		count[1] = 0;

		for (int i = 0; i < matrix.length; i++)
    {
			count[matrix[i][i]]++;

			if (count[0] == matrix.length)
      {
        return 0;
      }
			if (count[1] == matrix.length)
      {
        return 1;
      }
		}
		return -1;
	}




	public static int[] allColumn(int[][] matrix)
  {

		int[] result = new int[matrix.length];

		for (int i = 0; i < result.length; i++)
    {
			result[i] = -1;
		}

		int[] count = new int[2];

		for (int i = 0; i < matrix.length; i++)
    {
			count[0] = 0;
			count[1] = 0;

			for (int j = 0; j < matrix[i].length; j++)
      {
				count[matrix[j][i]]++;

				if (count[0] < j + 1 && count[1] < j + 1)
        {
					break;
				}
			}

			if (count[0] >= matrix.length || count[1] >= matrix.length)
      {
        result[i] = count[0] > count[1] ? 0 : 1;
      }
		}
		return result;
	}




	public static int[] allRow(int[][] matrix)
  {

		int[] result = new int[matrix.length];

		for (int i = 0; i < result.length; i++)
    {
			result[i] = -1;
		}

		int[] count = new int[2];

		for (int i = 0; i < matrix.length; i++)
    {

			count[0] = 0;
			count[1] = 0;

			for (int j = 0; j < matrix[i].length; j++)
      {
				count[matrix[i][j]]++;

				if (count[0] < j + 1 && count[1] < j + 1)
        {
					break;
				}
			}

			if (count[0] >= matrix.length || count[1] >= matrix.length)
      {
				result[i] = count[0] > count[1] ? 0 : 1;
      }
		}
		return result;
	}




	public static int[][] getMatrix()
  {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size for the matrix: ");

		int size = input.nextInt();

		int[][] matrix = new int[size][size];

		for (int i = 0; i < matrix.length; i++)
    {
			for (int j = 0; j < matrix[i].length; j++)
      {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}

		return matrix;
	}



	public static void print(int[][] matrix)
  {

		for (int i = 0; i < matrix.length; i++)
    {
			for (int j = 0; j < matrix[i].length; j++)
      {
				System.out.print(matrix[i][j]);
			}

			System.out.println();
		}
	}
}
