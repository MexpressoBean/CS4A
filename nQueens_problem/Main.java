// nQueens Practice Problem - will be heavily related to the midterm problem



public class Main
{
  public static void main(String[] args)
  {
    final int BOARD_SIZE = 4;
    int[][] board = new int[BOARD_SIZE][BOARD_SIZE]; // 4 x 4 board

    // initializes the board to all empty spaces (0)
    initBoard(board, BOARD_SIZE);


    if(solve(board, 0, BOARD_SIZE) == false)
    {
      System.out.print("No solution found");
    }

    printBoard(board, BOARD_SIZE);

  }// END main


//************************ Methods *****************************


  public static void initBoard(int[][] board, int boardSize)
  {
    for(int i = 0; i < boardSize; i++)
    {
      for(int j = 0; j < boardSize; j++)
      {
        board[i][j] = 0;
      }
    }
  } // END initBoard



  public static void printBoard(int[][] board, int boardSize)
  {
    for(int i = 0; i < boardSize; i++)
    {
      for(int j = 0; j < boardSize; j++)
      {
        System.out.print(board[i][j] + " ");
      }

      System.out.println();
    }
  } // END printBoard




  public static boolean solve(int[][] board, int column, int boardSize)
  {
      if(column >= boardSize)
      {
        return true;
      }

      for(int i = 0; i < boardSize; i++)
      {
        if(isSafe(board, i, column, boardSize))
        {
          board[i][column] = 1;

          if(solve(board, column + 1, boardSize))
          {
            return true;
          }

          board[i][column] = 0; // backtrack here
        }
      }
      return false; // No solution found
  } // END solve



public static boolean isSafe(int[][] board, int row, int column, int boardSize)
{
  int i;
  int j;

     for (i = 0; i < column; i++)
     {
       if (board[row][i] == 1)
       {
         return false;
       }
     }


     for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
     {
       if (board[i][j] == 1)
       {
          return false;
       }
     }


     for (i = row, j = column; j >= 0 && i < boardSize; i++, j--)
     {
       if (board[i][j] == 1)
       {
          return false;
       }
     }


     return true;
  } // END isSafe

}
