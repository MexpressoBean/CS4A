// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 5.26 from pg. 196 in chapter 5

public class Ex_5_26
{
  public static void main(String [] args)
  {
    double firstRun  = computeEValue(10000.0);
    double secondRun = computeEValue(20000.0);
    double thirdRun  = computeEValue(100000.0);


    System.out.println("The e value when i = 10000  is " + firstRun);

    System.out.println("The e value when i = 20000  is " + secondRun);

    System.out.println("The e value when i = 100000 is " + thirdRun);

  }

  // Function that computes e value
  public static double computeEValue(double value)
  {
    double e = 1.0;

    for (double i = 1; i <= value; i++)
    {
      double denominator = i;

      for (double g = i - 1; g >= 1; g--)
      {
        denominator *= g;
      }
      e += (1 / denominator);
    }

    return e;

  }
}
