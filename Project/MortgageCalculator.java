import java.util.Scanner;
public class MortgageCalculator {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println( "=== Bangladesh Mortgage Calculator (BDT) ===");
 // Amount
 System.out.println(" Enter loan amount (Principal in BDT) : ");
 double loanAmount = scanner.nextDouble();

 System.out.println( " Enter annual interest rate (e.g., 8.5 for 8.5%) : ");
 double annualInterest = scanner.nextDouble();

 System.out.println( " Enter loan period (in years): ");
 int years = scanner.nextInt();

 System.out.println( "=== Mortgage Summary ===");

 // Calculation
 double monthlyInterest = annualInterest/12;
 int numberOfpayments = years*12;
 
 // Payment Formula 
//double monthlyPayment = 
}
    
}
 