// Kevin Ramirez
// CS4A T/TH at 7:30
// Tax calculator problem from chapter 3 slides (slide 26)

import java.util.*;
import java.text.DecimalFormat;

public class TaxCalculator
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double salary = 0;
    double totalTax = 0;
    double totalEffectiveRate = 0;

    System.out.print("Please enter your salary: $");
    salary = input.nextDouble();


    // Selection construct that decides how the users tax will be calculated
    if(salary >= 0 && salary <= 8350)
    {
      //System.out.println("Tier 1: 0 - $8350");
      totalTax = (0.10 * salary);

      totalEffectiveRate = ((totalTax/salary) * 100);

      printTaxResult(totalTax, totalEffectiveRate);

    }
    else if(salary > 8350 && salary <= 33950)
    {
      //System.out.println("Tier 2: $8351 - $33950");
      totalTax = (8350 * 0.10) + ((salary - 8350) * 0.15);

      totalEffectiveRate = ((totalTax/salary) * 100);

      printTaxResult(totalTax, totalEffectiveRate);

    }
    else if(salary > 33950 && salary <= 82250)
    {
      //System.out.println("Tier 3: $33951 - $82250");
      totalTax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((salary - 33950) * 0.25);

      totalEffectiveRate = ((totalTax/salary) * 100);

      printTaxResult(totalTax, totalEffectiveRate);

    }
    else if(salary > 82250 && salary <= 171550)
    {
      //System.out.println("Tier 4: $82251 - $171550");
      totalTax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((salary - 82250) * 0.28);

      totalEffectiveRate = ((totalTax/salary) * 100);

      printTaxResult(totalTax, totalEffectiveRate);

    }
    else if(salary > 171550 && salary <= 372950)
    {
      //System.out.println("Tier 5: $171551 - $372950");
      totalTax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((salary - 171550) * 0.33);

      totalEffectiveRate = ((totalTax/salary) * 100);

      printTaxResult(totalTax, totalEffectiveRate);

    }
    else if(salary > 372950)
    {
      //System.out.println("Tier 6: $372951");
      totalTax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((372950 - 171550) * 0.33) + ((salary - 372950) * 0.35);

      totalEffectiveRate = ((totalTax/salary) * 100);

      printTaxResult(totalTax, totalEffectiveRate);

    }
    else
    {
      System.out.println("Invalid input");
    }
  } // END Main


  // Function prints and formats the total tax and effective tax rate
  public static void printTaxResult(double tax, double effectiveRate)
  {
    DecimalFormat format = new DecimalFormat("##.00");

    System.out.println("Total Tax Paid: $" + format.format(tax));
    System.out.println("Effective Tax Rate: " + format.format(effectiveRate) + "%");
  }
}
