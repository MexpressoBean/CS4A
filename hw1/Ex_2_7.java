// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 2.7 from pg. 70 in chapter 2

import java.util.*;

public class Ex_2_7
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    final int MIN_PER_YEAR = 525600;
    final int DAYS_PER_YEAR = 365;
    int minutes = 1000000000;
    int years = 0;
    int days = 0;

    years = minutes / MIN_PER_YEAR;

    days = (minutes % MIN_PER_YEAR) / 1440;

    System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

  }
}
