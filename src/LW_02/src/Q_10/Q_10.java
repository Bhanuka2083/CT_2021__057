
package LW_02.src.Q_10;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Q_10 {
    public static void main(String[] args) {

        Scanner loan = new Scanner(System.in);

        double loanAmount;
        System.out.print("Enter loan amount : ");
        loanAmount = loan.nextDouble();

        double annualInterestRate;
        System.out.print("Enter annual interest rate : ");
        annualInterestRate = loan.nextDouble();

        double loanPeriod;
        System.out.print("Enter loan period : ");
        loanPeriod = loan.nextDouble();

        final int Month_In_Year = 12;

        double monthlyInterestRate = annualInterestRate /100.0 /Month_In_Year;
        double numberOfPayments = loanPeriod * Month_In_Year;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - pow(1/(1+monthlyInterestRate),numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly interest rate is "+ monthlyInterestRate);

        System.out.println("Number of payments is "+ numberOfPayments);

        System.out.println("Monthly payment is "+ monthlyPayment);

        System.out.println("Total payment is "+ totalPayment);


    }

}
