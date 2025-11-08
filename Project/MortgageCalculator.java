import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println( "=== Bangladesh Mortgage Calculator (BDT) ===");

 System.out.print(" Enter loan amount (Principal in BDT) : ");
 double loanAmount = scanner.nextDouble();

 System.out.print( " Enter annual interest rate (e.g., 8.5 for 8.5%) : ");
 double annualInterest = scanner.nextDouble();

 System.out.print( " Enter loan period (in years): ");
 int years = scanner.nextInt();

 double monthlyRate = ( annualInterest /100 )/12;
 int months = years*12;
 double monthlyPayment = loanAmount * (monthlyRate*Math.pow((1 + monthlyRate),months))/
 ((Math.pow((1 +monthlyRate),months))-1);

 double totalPayment = monthlyPayment * months;
 double totalInterest = totalPayment-loanAmount;

Locale bdlocale = new Locale( "en", "BD");
NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdLocale);

 System.out.println( "=== Mortgage Summary ===");

 double monthlyInterest = annualInterest/12;
 int numberOfPayments = years*12;

 System.out.println(" Loan Amount: " + currencyFormatter.format(loanAmount));

 System.out.println( " MonthlyPayment : " + currencyFormatter.format(monthlyPayment));

 System.out.println(" Total Payment : " +  currencyFormatter.format(totalPayment));

System.out.println(" Total Interest : " + currencyFormatter.format(totalInterest));

scanner.close();
 
}
    
}
 