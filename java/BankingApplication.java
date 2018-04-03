/*package try3;

import java.text.NumberFormat;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String args[]) {
		LoanCalculator loanCalculator = new LoanCalculator();
		BankAdmin bankAdmin = new BankAdmin();
		Customer customer = new Customer();

		Scanner scan = new Scanner(System.in);
		int loanAmount;
		int loanTerm = 0;

		int userChoice = customer.getUserChoice();
		String loanType = customer.getLoanType(userChoice);
		double interestRate = bankAdmin.getInterestRate(loanType);
		interestRate = interestRate / 12 / 100;
		NumberFormat nf = NumberFormat.getInstance();

		try {
			System.out.println("Enter the loan amount");
			loanAmount = scan.nextInt();

			while (loanTerm == 0) {
				System.out.println("1.loan term in year " + "  2.loan term in month");
				int input = scan.nextInt();
				if (input == 1) {
					System.out.println("Enter the loan term in year");
					loanTerm = scan.nextInt();
					loanTerm = loanTerm * 12;
				} else if (input == 2) {
					System.out.println("Enter the loan term in month");
					loanTerm = scan.nextInt();
				} else {
					System.out.println("Invalid input");
					continue;
				}
			}

			int Emi = loanCalculator.getEMI(loanAmount, loanTerm, interestRate);
			System.out.println("EMI is " + nf.format(Emi));
			
			int amountPayable = loanCalculator.getAmountPayable(loanTerm, Emi);
			System.out.println("Total amount Payable is " + nf.format(amountPayable));

			int interestTowardsLoan = loanCalculator.getinterestTowardsLoan(loanTerm, Emi, loanAmount);
			System.out.println("Interest towards loan " + nf.format(interestTowardsLoan));

		} catch (Exception e) {
			System.out.println("Invalid format ..Please enter proper value " + e);
		}

	}

}
*/