package try3;

import java.util.Scanner;

public class Customer {

	public  int getUserChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Type of Loan");
		System.out.println("1. Home Loan  " + "2. Personal Loan   " + "3. Car Loan");
		int userChoice = scan.nextInt();
		return userChoice;

	}

	public  String getLoanType(int userChoice) {
		String loanType;
	
		switch (userChoice) {
		case 1:
			userChoice = 1;
			loanType = "HomeLoan";
			break;
		case 2:
			userChoice = 2;
			loanType = "PersonalLoan";
			break;
		case 3:
			userChoice = 3;
			loanType = "CarLoan";
			break;
		default:
			loanType = "Invalid Input";
            System.exit(1);
		}
	
		return loanType;
	}
}



