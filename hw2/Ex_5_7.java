// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 5.7 from pg. 193 in chapter 5

public class Ex_5_7
{
  public static void main(String [] args)
  {
    final double RATE = 0.05;
    int tuition = 10000;
    int totalTuitionCost = 0;
    int tuitionTenthYear = 0;

    for (int year = 1; year <= 14; year++)
    {
      // Increase tution by 5% every year
      tuition += (tuition * RATE);

      if (year > 10) // Test for after 10 years
      {
        totalTuitionCost += tuition;
      }

      if (year == 10)
      {
        tuitionTenthYear = tuition;
      }
    }


    System.out.printf("Tuition in ten years: $%d\n" ,tuitionTenthYear);


    System.out.println("Total cost for four years' worth of tuition" + " after the tenth year: $" + totalTuitionCost);
  }
}
