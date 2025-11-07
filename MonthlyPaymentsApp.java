import java.util.Scanner;

public class MonthlyPaymentsApp{
	static Scanner userinput = new Scanner(System.in);

		static double computePayment(
		                   double loanAmt,
		                   double rate,
		                   int numPeriods) {

			 //I needed to convert the years entered by the user into months, so I added this line.
             int numPeriodsMonths = numPeriods*12;

			 //The rate needed to be divided both by 100 and by 12.
		     double interest = (rate / 100.0)/12;

			 //I changed the subtraction in the first term to addition.
			 //Also, changed the power from negative to positive.
		     double partial1 = Math.pow((1 + interest), numPeriodsMonths);

			 //Changed this line from 1 - partial1.
		     double denominator = partial1 - 1;

			 //I was able to shorten this math statement as well a correcting it.
		     double answer = (loanAmt * interest * partial1) / denominator;

		     return answer;
		 }

		 public static void main (String[] args){  
			 //I add formatting here, and in a number of other places as well.
             System.out.println("\n");

			 System.out.println("Welcome to Monthly Mortgage Calculator");

			 //Formatting.
             System.out.println("\n");

			 System.out.print ("Enter principle: ");
			 //I changed the names of the variables as well, because a,b, and c are not very descriptive.
			 //Here I changed a to principal.
			 double principle = userinput.nextDouble();

			 //Formatting.
             System.out.println("\n");

			 //I added an example here, because the prompt was a little confusing.
			 System.out.print ("Enter yearly interest rate without percent (Ex: 4.75 instead of 4.75%): ");
			 //I changed b to yearlyRate.
			 double yearlyRate = userinput.nextDouble();

			 //Formatting.
             System.out.println("\n");

			 System.out.print ("Enter number of years: ");
			 //I also changed c to years.
		     int years = userinput.nextInt();

			 //Formatting.
             System.out.println("\n");

			 //I Changed this to a format string in order to print the answer to two decimal points.
		     System.out.format("The monthly payment is $%5.2f.%n", (double)computePayment(principle, yearlyRate, years));

			 //Formatting.
             System.out.println("\n");

			 //Closed the scanner.
             userinput.close();

			 //I added a line that tells the user the program is ending.
             System.out.println("Program is ending...");

			 //Formatting.
             System.out.println("\n");
		}
  }