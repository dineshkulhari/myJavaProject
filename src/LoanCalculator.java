import java.awt.*;
import java.util.Scanner;

/**
 * Created by Dinesh on 9/5/2015.
 */
public class LoanCalculator {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Enter the Annual Interest
            System.out.println("Enter anual Interest Rate : ");
            double annualInterestRate = input.nextDouble();

            //Monthly Interest Rate
            double monthlyInterestRate = annualInterestRate / 1200;


            // Enter the Annual Interest
            System.out.println("Enter No Of Years Of Interest: ");
            double numberOfYears = input.nextInt();

            // Enter the loan amount
            System.out.println("Enter Load Amount: ");
            double loadAmount = input.nextDouble();

            // Calculate the EMI
            double monthlyPayment = loadAmount * monthlyInterestRate /
                    (1 - 1/ Math.pow(1 + monthlyInterestRate , numberOfYears * 12 ));
            // Calculate total Payment
            double totalPayment = monthlyPayment * numberOfYears * 12;


            // Print All Values for display

            System.out.println("The Monthly Payment is : " + (int)(monthlyPayment*100 / 100.0));

            System.out.println("Total Interest Payment is : " + (int)(totalPayment*100 / 100.0));

            /*
            System.out.println(annualInterestRate);
            System.out.println(monthlyInterestRate);
            System.out.println(numberOfYears);
            System.out.println(loadAmount);
            */


        }
}
