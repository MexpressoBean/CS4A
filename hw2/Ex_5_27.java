// Kevin Ramirez
// CS4A T/TH at 7:30
// Problem 5.27 from pg. 197 in chapter 5

public class Ex_5_27
{
  public static void main(String [] args)
  {
		int count = 0;

    System.out.println("All of the leap years from 101 to 2100:");

		for (int year = 101; year <= 2100; year++)
    {
			// Condition for leap year
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
      {
				count++;

        if(count % 10 == 0)
        {
          System.out.print(year + "\n");
        }
        else
        {
          System.out.print(year + " ");
        }
			}
		}

  }
}
