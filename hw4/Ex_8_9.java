// Kevin Ramirez
// CS4A
// Ex 8.9 on pg. 308
// Description: Write a program for a two player tic tac toe game

import java.util.*;

public class Ex_8_9
{
  public static void main(String[] args)
  {
    // Create a empty board
		String [][] board = getEmptyBoard();

		// Create two players moves
		String[] moves = {" X "," O "};

		int result;

		// Repeat while game is not win or draw
		do {

			print(board);

			int[] space = getSpace(board, moves[0]);

			placeMove(board, space, moves[0]);

			// Determine game if game is win or draw
			result = getGameStatus(board, moves[0]);

			// If status is game not over, player next move
			if (result == 2)
      {
				swap(moves);
			}

		}while(result == 2);

		// Display board
		print(board);


		// Display game result
		if (result == 0)
    {
      System.out.println(moves[0] + "player won");
    }
		else
    {
      System.out.println("Players draw");
    }


  }// END main



	public static void print(String[][] board)
  {
		System.out.println("\n-------------");
		for (int i = 0; i < board.length; i++)
    {
			for (int j = 0; j < board[i].length; j++)
      {
				System.out.print("|" + board[i][j]);
			}
			System.out.println("|\n-------------");
		}
	}// END print


	public static int getGameStatus(String[][] m, String e)
  {
		if (isWin(m, e))
    {
      return 0; // Game won
    }
		else if (isDraw(m))
    {
      return 1; // Game is a draw
    }
		else
    {
  		return 2; // Game is not over yet
    }
	}// END getGameStatus





	public static boolean isWin(String[][] board, String move)
  {
		return (isHorizontalWin(board, move) || isVerticalWin(board, move) || isDiagonalWin(board, move));
	} // End isWin




  public static boolean isHorizontalWin(String[][] board, String move)
  {
		for (int i = 0; i < board.length; i++)
    {
			int count = 0;

			for (int j = 0; j < board[i].length; j++)
      {
				if (board[i][j] == move)
        {
          count++;
        }
			}

			if (count == 3)
      {
        return true;
      }
		}
		return false;
	} // END isHorizontalWin




	public static boolean isVerticalWin(String[][] board, String move)
  {
		for (int i = 0; i < board.length; i++)
    {
			int count = 0;

			for (int j = 0; j < board[i].length; j++)
      {
				if (board[j][i] == move)
        {
          count++;
        }
			}
			if (count == 3)
      {
				return true;
      }
		}
		return false;
	}// END isVerticalWin




  public static boolean isDiagonalWin(String[][] board, String move)
  {
		int count = 0;
		for (int i = 0; i < board.length; i++)
    {
			if (board[i][i] == move)
      {
        count++;
      }
			if (count == 3)
      {
        return true;
      }
		}
		count = 0;

		for (int i = 0, j = board[i].length - 1; j >= 0 ; j--, i++)
    {
			if (board[i][j] == move)
      {
				count++;
      }
			if (count == 3)
      {
				return true;
      }
		}
		return false;
	}// isDiagonalWin



  public static boolean isDraw(String[][] board)
  {
		for (int i = 0; i < board.length; i++)
    {
			for (int j = 0; j < board[i].length; j++)
      {
				if (board[i][j] == "   ")
        {
          return false;
        }
			}
		}
		return true; // game ends in a draw
	}// END isDraw




	public static void swap(String[] place)
  {
		String temp = place[0];
		place[0] = place[1];
		place[1] = temp;
	} // END swap




  public static void placeMove(String[][] board, int[] opt, String move)
  {
		board[opt[0]][opt[1]] = move;
	}// END placeMove



	public static int[] getSpace(String[][] board, String move)
  {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int[] space = new int[2]; // Cell row and column

		// Prompt player to enter a token
		do
    {
			System.out.print("Enter a row(0, 1, or 2) for player " + move + ": ");
			space[0] = input.nextInt();

			System.out.print("Enter a column(0, 1, or 2) for player " + move + ": ");
			space[1] = input.nextInt();

		}while (!isEmptySpace(board, space));

    input.close();

		return space;
	}// END getSpace




  // Returns an empty 3x3 tic tac toe board
  public static String[][] getEmptyBoard()
  {
		String[][] board = new String[3][3];
		for (int i = 0; i < 3; i++)
    {
			for (int j = 0; j < 3; j++)
      {
				board[i][j] = "   ";
			}
		}
		return board;
	} // END getEmptyBoard




  // Tells if the space is empty
  public static boolean isEmptySpace(String[][] board, int[] space)
  {
    for (int i = 0; i < space.length; i++)
    {
      if (space[i] < 0 || space[i] >= 3)
      {
        System.out.println("Invalid cell");
        return false; // Space is occupied
      }
    }
    if (board[space[0]][space[1]] != "   ")
    {
      System.out.println("\nRow " + space[0] + " column " + space[1] + " is occupied");

      return false; // Space is occupied
    }
    return true; // Space is empty
  }
} // END isEmptySpace
