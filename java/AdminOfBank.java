/*package try3;

import java.util.Scanner;

public class AdminOfBank {

	AdminOfBank adminOfBank = new AdminOfBank();

	private double interest;

	public double getInterest() {
		return this.interest;
	}

	public void setInterest(double num) {
		this.interest = num;
	}

	public int getAdminChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.HomeLoan  " + "2.PersonalLoan  " + "3.Car Loan ");
		int adminChoice = scan.nextInt();
		return adminChoice;
	}

	public void getandShowInterestRate(int adminChoice) {
		Scanner scan = new Scanner(System.in);

		switch (adminChoice) {
		case 1:
			adminChoice = 1;
			System.out.println("Enter the Interest");
			double newInterest = scan.nextDouble();
			adminOfBank.setInterest(newInterest);
			double num = adminOfBank.getInterest();

			break;
		case 2:
			adminChoice = 2;
			bankAdmin.ChangeInterestRate();
		default:
			System.out.println("Invalid Input");
			System.exit(1);
		}

	}

}
*/