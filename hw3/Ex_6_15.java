// Kevin Ramirez
// CS4A
// Ex 6.15 on pg. 237
// Description: Listing 3.5 gives a program to compute tax. Write a method for computing tax

public class Ex_6_15
{
	public static void main(String[] args)
  {
		double start = 50000;
		double end = 60000;
		double increase = 50;

		// Print header
		System.out.println(
			"\nTaxable      Single      Married Joint       Married        Head of\n" +
			"Income                   or Qualifying       Separate       a House\n" +
			"                         Widow(er)\n" +
			"---------------------------------------------------------------------");
		// Print Data
		for (double taxableIncome = start; taxableIncome <= end; taxableIncome += increase)
    {
			System.out.printf("%-13.0f", taxableIncome);
			System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
			System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
			System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
			System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
		}
	}



	public static double computeTax(int status, double taxableIncome)
	{
		double tax = 0; 				    // Total tax
		double taxRate = 0;
		double incomeTaxed = 0;
		double incomeUntaxed = 0; 	// Untaxed income
		double taxAt15Pecent = 0; 	// 15% tax bracket
		double taxAt25Pecent = 0; 	// 25% tax bracket
		double taxAt28Pecent = 0; 	// 28% tax bracket
		double taxAt33Pecent = 0; 	// 33% tax bracket
		double taxAt35Pecent = 0;	// 35% tax bracket


		switch (status)
    {
			case 0 :
						taxAt15Pecent = 8351;
						taxAt25Pecent = 33951;
						taxAt28Pecent = 82251;
						taxAt33Pecent = 171551;
						taxAt35Pecent = 372951;
            break;

			case 1 :
						taxAt15Pecent = 16701;
						taxAt25Pecent = 67901;
						taxAt28Pecent = 137051;
						taxAt33Pecent = 208851;
						taxAt35Pecent = 372951;
            break;

			case 2 :
						taxAt15Pecent = 8351;
						taxAt25Pecent = 33951;
						taxAt28Pecent = 68526;
						taxAt33Pecent = 104426;
						taxAt35Pecent = 186476;
            break;

			case 3 :
						taxAt15Pecent = 11951;
						taxAt25Pecent = 45501;
						taxAt28Pecent = 117451;
						taxAt33Pecent = 190201;
						taxAt35Pecent = 372951;
		}

		// Compute tax
		while (taxableIncome >= taxAt15Pecent) {

			// Compute tax rate and untaxed income
			if (taxableIncome >= taxAt35Pecent) {
				taxRate = 0.35;
				incomeUntaxed = taxAt35Pecent - 1;
			}
			else if (taxableIncome >= taxAt33Pecent) {
				taxRate = 0.33;
				incomeUntaxed = taxAt33Pecent - 1;
			}
			else if (taxableIncome >= taxAt28Pecent) {
				taxRate = 0.28;
				incomeUntaxed = taxAt28Pecent - 1;
			}
			else if (taxableIncome >= taxAt25Pecent) {
				taxRate = 0.25;
				incomeUntaxed = taxAt25Pecent -1;
			}
			else if (taxableIncome >= taxAt15Pecent) {
				taxRate = 0.15;
				incomeUntaxed = taxAt15Pecent - 1;
			}

			tax += (incomeTaxed = taxableIncome - incomeUntaxed) * taxRate;
			taxableIncome -= incomeTaxed;	// Update taxable income
		}

		return tax += taxableIncome * 0.10;
	}
}
