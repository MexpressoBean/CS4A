// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 2.14 from pg. 72 in chapter 2

import java.util.*;

public class Ex_2_14
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double weight = 0;
    double height = 0;
    double bmi = 0;


    System.out.print("Enter weight in pounds: ");
    weight = input.nextDouble();

    System.out.print("Enter height in inches: ");
    height = input.nextDouble();


    bmi = computeBmi(weight, height);

    System.out.println("BMI is " + bmi);
  }


  public static double computeBmi(double weight, double height)
  {
    final int BMI_FORMULA_CONST = 703;
    double bmiResult = 0;

    bmiResult = (BMI_FORMULA_CONST * weight) / (height * height);

    return bmiResult;
  }
}
