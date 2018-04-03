package try3;

public class LoanCalculator {

	public int getEMI(int loanAmount, int loanTerm, double interestRate) {

		double monthlyEMI = loanAmount * interestRate
				* ((Math.pow((1 + interestRate), loanTerm) / (Math.pow((1 + interestRate), loanTerm) - 1)));

		int roundoff = (int) Math.round(monthlyEMI);
		return roundoff;
	}

	public int getAmountPayable(int loanTerm, int roundoff) {
		int amountPayable = roundoff * loanTerm;
		return amountPayable;

	}

	public int getinterestTowardsLoan(int loanTerm, int roundoff, int loanAmount) {
		int interestTowardsLoan = (roundoff * loanTerm) - (loanAmount);
		return interestTowardsLoan;
	}
}
