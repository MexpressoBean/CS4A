// Kevin Ramirez
// CS4A
// Ex 6.30 on pg. 241
// Description: Write a program that is a craps game

import java.util.*;

public class Ex_6_30
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    final int MAX_VALUE = 6;
    final int MIN_VALUE = 1;
    int dice1 = 0;
    int dice2 = 0;
    int sum = 0;
    int lastSum = 0;


    do
    {
      dice1 = numGen(MAX_VALUE, MIN_VALUE);
      dice2 = numGen(MAX_VALUE, MIN_VALUE);

      sum = dice1 + dice2;
      System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

      if(sum == lastSum)
      {
        System.out.println("You win\n");
        break;
      }

      if(sum == 2 || sum == 3 || sum == 7 || sum == 12 || dice1 == 7 || dice2 == 7)
      {
        System.out.println("You lose\n");
        break;
      }
      else
      {
        System.out.println("Point is " + sum + "\n");
      }

      lastSum = sum;

    }while(!(sum == 2 || sum == 3 || sum == 12 || dice1 == 7 || dice2 == 7));

  }



  public static int numGen(int max, int min)
  {
    int num = (int)(Math.random() * ((max - min) + 1)) + min;

    return num;
  }


}
