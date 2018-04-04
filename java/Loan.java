package calculator;

public class Loan {
	LoanCalculator loanCalculator = new LoanCalculator();

	public enum LoanType {
		HOME, PERSONAL, CAR
	}

	private double interestForHome = 10.75;
	private double interestForpersonal = 17.5;
	private double interestForCar = 12.5;

	public double getInterestRate(LoanType loantype) {
		switch (loantype) {
		case HOME:
			return interestForHome;
		case PERSONAL:
			return interestForpersonal;
		case CAR:
			return interestForCar;
		default:
			System.out.println("Invalid Input...Enter proper LoanType");
			return 0.0;
		}
	}

	public double setInterestRate(LoanType loantype, double newInterest) {

		switch (loantype) {
		case HOME:
			this.interestForHome = newInterest;
			return newInterest;
		case PERSONAL:
			this.interestForpersonal = newInterest;
			return newInterest;
		case CAR:
			this.interestForCar = newInterest;
			return newInterest;
		default:
			System.out.println("Invalid Input...Enter proper LoanType and InterestValue");
			return 0.0;
		}
	}

	public int getEMI(int loanAmount, int loanTerm, double interestRate) {

		if (loanTerm <= 0 || loanAmount <= 0) {
			return 0;
		} else {
			interestRate = interestRate / 12 / 100;
		    // Formula for Calculating Monthly Installments
			double monthlyEMI = loanAmount * interestRate * ((Math.pow((1 + interestRate), loanTerm) / (Math.pow((1 + interestRate), loanTerm) - 1)));
			int EMI = (int) Math.round(monthlyEMI);
			return EMI;
		}
	}

	public int getAmountPayable(int loanTerm, int EMI) {
		if (loanTerm <= 0 || EMI <= 0) {
			return 0;
		} else {
			//Total amount paid at the end of loan Term
			int amountPayable = EMI * loanTerm;
			return amountPayable;
		}
	}

	public int getinterestTowardsLoan(int loanTerm, int EMI, int loanAmount) {

		if (loanTerm <= 0 || loanAmount <= 0 || EMI <= 0) {
			return 0;
		} else {
			int interestTowardsLoan = (EMI * loanTerm) - (loanAmount);
			return interestTowardsLoan;
		}
	}
}
