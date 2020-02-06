// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 2.8 from pg. 70 in chapter 2

import java.util.*;

public class Ex_2_8
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the time zone to GMT: ");
    int offset = input.nextInt();


    long miliseconds = System.currentTimeMillis();

    long seconds = miliseconds / 1000;

    long currentSecond = seconds % 60;

    long minutes = seconds / 60;

    long currentMinute = minutes % 60;

    long hours = minutes / 60;

    long currentHour = hours % 24;

    currentHour = currentHour + offset;


    System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);






  }
}
