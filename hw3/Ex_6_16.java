// Kevin Ramirez
// CS4A
// Ex 6.16 on pg. 238
// Description: Write a program that determines and outputs the days in a year


public class Ex_6_16
{
  public static void main(String [] args)
  {

    displayTable();

  }


  public static void displayTable()
  {
    System.out.println("Year     Days in year");

    for (int year = 2000; year <= 2020; year++)
    {
      System.out.println(year + "         " + numberOfDaysInAYear(year));
    }
  }


  public static boolean isLeapYear(int year)
  {

    return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
  }



  public static int numberOfDaysInAYear(int year){
    if (isLeapYear(year))
    {
      return 366;
    }
    else
    {
      return 365;
    }
  }
}
