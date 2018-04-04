package calculator;

public class LoanCalculator {

	/*public int getEMI(int loanAmount, int loanTerm, double interestRate) {

		if (loanTerm <= 0 || loanAmount <= 0) {
			return 0;
		} else {
			interestRate = interestRate / 12 / 100;
			double monthlyEMI = loanAmount * interestRate
					* ((Math.pow((1 + interestRate), loanTerm) / (Math.pow((1 + interestRate), loanTerm) - 1)));
			int EMI = (int) Math.round(monthlyEMI);
			return EMI;
		}
	}

	public int getAmountPayable(int loanTerm, int EMI) {
		if (loanTerm <= 0 || EMI <= 0) {
			return 0;
		} else {
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
	}*/
}
