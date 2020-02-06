// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 4.8 from pg. 153 in chapter 4
import java.util.*;

public class Ex_4_8
{
  public static void main(String [] args)
  {
    Scanner input =  new Scanner(System.in);
    int asciiNum = 0;
    char asciiCharacter = ' ';

    System.out.print("Enter an ASCII code: ");
    asciiNum = input.nextInt();

    asciiCharacter = (char)asciiNum;

    System.out.println("The character for ASCII code " + asciiNum + " is " + asciiCharacter);

  }
}
