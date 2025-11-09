import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = 0;
        
        while (true) {
            System.out.print("Enter Your Salary: ");
            if (sc.hasNextDouble()) {
                salary = sc.nextDouble();
                if (salary > 0) break;
                else System.out.println("Salary must be positive. Try again.");
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
        }

        int credit = 0;
    
        while (true) {
            System.out.print("Enter Your Credit Score (0-500): ");
            if (sc.hasNextInt()) {
                credit = sc.nextInt();
                if (credit >= 0 && credit <= 500) break;
                else System.out.println("Enter a valid Credit Score (0-500).");
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
            }
        }

        boolean record = false;
        
        while (true) {
            System.out.print("Do You Have Any Criminal Record (true/false): ");
            if (sc.hasNextBoolean()) {
                record = sc.nextBoolean();
                break;
            } else {
                System.out.println("Enter a valid record (true/false).");
                sc.next();
            }
        }

        if (record) {
            System.out.println("You are not eligible for loan.");
        } else {
            double loan = salary * 2;
            System.out.println("=== Bangladesh Mortgage Calculator (BDT) ===");

            System.out.print("Enter loan amount (Principal in BDT): ");
            double principal = sc.nextDouble();

            if ((principal <= loan && credit >= 300) && !record) {
                System.out.print("Enter annual interest rate ( e.g., 8.5 for 8.5%) :");
                float interest = sc.nextFloat();
                System.out.print("Enter loan period (in years): ");
                int years = sc.nextInt();

                float interestRate = (interest / 100 / 12);
                int totalMonth = years * 12;

                double mortgage = principal * (interestRate * Math.pow(1 + interestRate, totalMonth))
                        / (Math.pow(1 + interestRate, totalMonth) - 1);
                double totalPayment = mortgage * totalMonth;
                double totalInterest = totalPayment - principal;

                Locale bdlocale = Locale.of("en", "BD");
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdlocale);

                System.out.println("=== Mortgage Summary ===");
                System.out.println("Loan Amount: " + currencyFormatter.format(principal));
                System.out.println("Monthly Payment: " + currencyFormatter.format(mortgage));
                System.out.println("Total Payment: " + currencyFormatter.format(totalPayment));
                System.out.println("Total Interest: " + currencyFormatter.format(totalInterest));
            } else {
                System.out.println("You Are Not Eligible For Loan.");
            }
        }

        sc.close();
    }
}
