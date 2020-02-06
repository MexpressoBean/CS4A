// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 4.21 from pg. 155 in chapter 4
import java.util.*;

public class Ex_4_21
{
  public static void main(String [] args)
  {
    final int SSN_LENGTH = 11;
    Scanner input = new Scanner(System.in);
    String socialSecNum = "";
    boolean valid = false;

    System.out.print("Enter a SSN: ");
    socialSecNum = input.nextLine();


    valid = (socialSecNum.length() == SSN_LENGTH) &&
             socialSecNum.charAt(3) == '-' &&
             socialSecNum.charAt(6) == '-' &&
             Character.isDigit(socialSecNum.charAt(2)) &&
             Character.isDigit(socialSecNum.charAt(7)) &&
             Character.isDigit(socialSecNum.charAt(10));


    if(valid)
    {
      System.out.println(socialSecNum + " is a valid social security number.");
    }
    else
    {
      System.out.println(socialSecNum + " is an invalid social security number.");
    }

  }
}
