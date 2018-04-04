package calculator;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import calculator.Loan.LoanType;

public class BankingApplication {

	enum UserChoice {
		ADMIN, CUSTOMER, STOP
	}

	public static void main(String args[]) {

		Loan loan = new Loan();
		NumberFormat nf = NumberFormat.getInstance();

		String choice = "";
		while (!choice.toUpperCase().equals(UserChoice.STOP)) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Admin " + " Customer " + " Stop");
				choice = scan.next();
				UserChoice userOrAdmin = UserChoice.valueOf(choice.toUpperCase());

				if (userOrAdmin == UserChoice.ADMIN) {
					System.out.println("Enter the Type of Loan");
					System.out.println(" Home " + " Personal " + " Car");
					LoanType loantype = LoanType.valueOf((scan.next()).toUpperCase());

					System.out.println("ViewInterest " + "ChangeInterest");
					String adminChoice = scan.next();

					if (adminChoice.equalsIgnoreCase("ViewInterest")) {
						double interestRate = loan.getInterestRate(loantype);
						System.out.println(loantype + " Loan Current Interest Rate is  " + interestRate);

					} else if (adminChoice.equalsIgnoreCase("ChangeInterest")) {
						System.out.println("Enter the Interest Rate");
						double newInterest = scan.nextDouble();
						double interestRate = loan.setInterestRate(loantype, newInterest);
						System.out.println(loantype + "Loan New Interest Rate is  " + interestRate);
					} else {
						System.out.println("You can either view Or Change Interest Rate");
					}

				} else if (userOrAdmin == UserChoice.CUSTOMER) {

					System.out.println("Enter the type of Loan");
					System.out.println(" Home " + " Personal " + " Car");
					LoanType loantype = LoanType.valueOf((scan.next()).toUpperCase());
					try {
						System.out.println("Enter the Loan amount");
						int loanAmount = scan.nextInt();

						System.out.println("Enter the Loan term in Months");
						int loanTerm = scan.nextInt();

						double interestRate = loan.getInterestRate(loantype);
						System.out.println("Interest Rate is" + interestRate);

						int Emi = loan.getEMI(loanAmount, loanTerm, interestRate);
						System.out.println("EMI is " + nf.format(Emi));

						int amountPayable = loan.getAmountPayable(loanTerm, Emi);
						System.out.println("Total amount Payable is " + nf.format(amountPayable));

						int interestTowardsLoan = loan.getinterestTowardsLoan(loanTerm, Emi, loanAmount);
						System.out.println("Interest towards loan " + nf.format(interestTowardsLoan));

					} catch (InputMismatchException e1) {
						System.out.println("Enter a Correct Value " + e1);

					}
				} else {
					System.out.println("Operation Ended..");
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Enter a proper value ");
			} catch (InputMismatchException e1) {
				System.out.println("Enter a Number Value");
			}

		}
	}
}
