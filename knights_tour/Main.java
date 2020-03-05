// Kevin Ramirez
// Date: 3/12/20
// Knights Tour Problem
// Description: A knight’s tour is a sequence of moves of a knight on a
// chessboard such that the knight visits every square exactly once.
// Knight's move in an L-shape on the chessboard. That is either two squares
// horizontally and one square vertically or one square horizontally and
// two squares vertically.
// Your algorithm only needs to find one solution to the problem.

import java.util.*;
import java.text.*;

public class Main
{
  public static void main(String[] args)
  {
    final int BOARD_SIZE = 8;
    int[][] visited = new int[BOARD_SIZE][BOARD_SIZE];
    int[] rowMoves = { 2, 1, -1, -2, -2, -1,  1,  2};
    int[] colMoves = { 1, 2,  2,  1, -1, -2, -2, -1};



    // Sets chessboard to all empty spaces (-99 = empty)
    initializeChessBoard(visited, BOARD_SIZE);

    startSolution(rowMoves, colMoves, BOARD_SIZE, visited);

  } // END main



//************************** Methods ***************************

  // Init chessboard - good
  public static void initializeChessBoard(int[][] board, int boardSize)
  {
    for(int i = 0; i < boardSize; i++) // Cols
    {
      for(int j = 0; j < boardSize; j++) // Rows
      {
        board[i][j] = -99;
      }
    }
  } // END initializeChessBoard



  // Print chessboard - good
  public static void printChessBoard(int[][] board, int boardSize)
  {
    DecimalFormat df = new DecimalFormat("00");

    for(int i = 0; i < boardSize; i++) // Cols
    {
      for(int j = 0; j < boardSize; j++) // Rows
      {
        System.out.print(df.format(board[i][j]) + "  ");
      }
      System.out.println();
    }
  } // END printChessBoard



  // Starts solution - calls solve recursively
  public static void startSolution(int[] xMoves, int[] yMoves, int boardSize, int[][] board)
  {
    board[0][0] = 0;

    if(solve(1, 0, 0, boardSize, xMoves, yMoves, board))
    {
      printChessBoard(board, boardSize);
    }
    else
    {
      System.out.println("No solution found");
    }
  }



  // Solve the problem using recursive algorithm
  public static boolean solve(int moveCount, int x, int y, int boardSize, int[] xMoves, int[] yMoves, int[][] board)
  {
    if(moveCount == boardSize * boardSize)
    {
      return true; // all possible board spaces have been visited
    }

    for(int i = 0; i < xMoves.length; i++)
    {
      int nextX = x + xMoves[i]; // trys all posible moves
      int nextY = y + yMoves[i];

      if(isValidMove(nextX, nextY, boardSize) && board[nextX][nextY] == -99) // if the move is valid and the board is less than zero (empty space)
      {
        board[nextX][nextY] = moveCount; // fills in the board space with the move count
        if(solve(moveCount + 1, nextX, nextY, boardSize, xMoves, yMoves, board)) // recursive call here
        {
          return true;
        }

        // Backtrack here
        board[nextX][nextY] = -99; // makes the board space empty again
      }
    }
    return false; // not able to find a move for the knight
  }// END solve



  // Determine if the knights move is possible (within board boundry)
  public static boolean isValidMove(int x, int y, int boardSize)
  {
    if(x < 0 || x >= boardSize || y < 0 || y >= boardSize)
    {
      return false; // move is not possible
    }
    else
    {
      return true; // move is possible
    }
  }// END isValidMove



}
