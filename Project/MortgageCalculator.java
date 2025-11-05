import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println( "=== Bangladesh Mortgage Calculator (BDT) ===");

 System.out.println(" Enter loan amount (Principal in BDT) : ");
 double loanAmount = scanner.nextDouble();

 System.out.println( " Enter annual interest rate (e.g., 8.5 for 8.5%) : ");
 double annualInterest = scanner.nextDouble();

 System.out.println( " Enter loan period (in years): ");
 int years = scanner.nextInt();

 double monthlyrate = ( annualInterest /100 )/12;
 int months = years*12;
 double monthlypayment = loanAmount * (monthlyrate*Math.pow((1 + monthlyrate),months))/
 ((Math.pow((1 +monthlyrate),months))-1);

 double totalpayment = monthlypayment * months;
 double totalinterest = totalpayment-loanAmount;

 NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

 System.out.println( "=== Mortgage Summary ===");

 double monthlyInterest = annualInterest/12;
 int numberOfpayments = years*12;

 System.out.println(" Loan Amount: " + currencyFormatter.format(monthlypayment));

 System.out.println( " MonthlyPayment : " + currencyFormatter.format(monthlypayment));

 System.out.println(" Total Payment : " +  currencyFormatter.format(totalpayment));

System.out.println(" Total Interest : " + currencyFormatter.format(totalinterest));

scanner.close();
 
}
    
}
 