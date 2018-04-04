package try1;

import java.util.Scanner;

public class Admin {
	Scanner scan = new Scanner(System.in);
	LoanCalculator loanCalculator = new LoanCalculator();

	public int getAdminChoice() {
		System.out.println("1.HomeLoan  " + "2.PersonalLoan  " + "3.Car Loan ");
		int adminChoice = scan.nextInt();
		return adminChoice;
	}

	public int viewOrChangeChoice() {
		System.out.println("1.viewRate " + "2.ChangeRate");
		int statusChoice = scan.nextInt();
		return statusChoice;
	}

	public double getandShowInterestRate(int adminChoice, int statusChoice) {
		double newInterest = 0.0;
		if (statusChoice == 2) {
			System.out.println("Enter the Interest");
			newInterest = scan.nextDouble();
			switch (adminChoice) {
			case 1:
				adminChoice = 1;
				System.out.println("the old Interestvalue for homeLoan is" + loanCalculator.getInterestForHome());
				loanCalculator.setInterestForHome(newInterest);
				System.out.println("the new value is" + loanCalculator.getInterestForHome());
				return newInterest;
			case 2:
				adminChoice = 2;
				System.out.println("the old Interestvalue for personalLoan is" + loanCalculator.getInterestForpersonal());
				loanCalculator.setInterestForpersonal(newInterest);
				System.out.println("the new value is" + loanCalculator.getInterestForpersonal());
				return newInterest;
			case 3:
				adminChoice = 3;
				System.out.println("the old Interestvalue for Car Loan is" + loanCalculator.getInterestForCar());
				loanCalculator.setInterestForCar(newInterest);
				System.out.println("the new value is" + loanCalculator.getInterestForCar());
				return newInterest;
			default:
				System.out.println("Invalid Input...Enter proper LoanType");
				return 0.0;
			}

		} else if (statusChoice == 1) {

			switch (adminChoice) {
			case 1:
				adminChoice = 1;
				System.out.println("the old Interestvalue for homeLoan is" + loanCalculator.getInterestForHome());
				return loanCalculator.getInterestForHome();
			case 2:
				adminChoice = 2;
				System.out.println("the old Interestvalue for personalLoan is" + loanCalculator.getInterestForpersonal());
				return loanCalculator.getInterestForpersonal();
			case 3:
				adminChoice = 3;
				System.out.println("the old Interestvalue for Car Loan is" + loanCalculator.getInterestForCar());
				return loanCalculator.getInterestForCar();
			default:
				System.out.println("Invalid Input...Enter proper LoanType");
				return 0.0;

			}

		} else {
			System.out.println("Invalid Input..You can either View Or Change");
			return 0.0;
		}

	}
}
