// Kevin Ramirez
// CS4A
// Ex 6.14 on pg. 237
// Description: Write a method that returns m(i) for a given i and
//              estimates pi write a test program that.

public class Ex_6_14
{
  public static void main(String [] args)
  {
    final int START = 1;
    final int END = 901;

    System.out.printf("%-12s %-12s \n", "i", "m(i)");
    System.out.println("----------------------------");

    for (double i = START; i <= END; i += 100)
    {
      System.out.printf("%-12.0f", i);
      System.out.printf("%-6.4f\n", computeSeries(i));
    }
  }


  public static double computeSeries(double num)
  {
    double piEstimate = 0;

    for (int i = 1; i <= num; i++)
    {
      piEstimate += Math.pow(-1, (i + 1)) / ((2 * i) - 1);
    }

    piEstimate *= 4;

    return piEstimate;
  }

}
