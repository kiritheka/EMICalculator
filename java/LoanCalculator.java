package try1;

public class LoanCalculator {

	private double interestForHome=10.5;
	private double interestForpersonal=17.5;
	private double interestForCar=12.5;
	
	public void setInterestForHome(double interestForHome) {
		this.interestForHome = interestForHome;
	}
	public double getInterestForHome() {
		return interestForHome;
	}

	public double getInterestForpersonal() {
		return interestForpersonal;
	}

	public void setInterestForpersonal(double interestForpersonal) {
		this.interestForpersonal = interestForpersonal;
	}

	public double getInterestForCar() {
		return interestForCar;
	}

	public void setInterestForCar(double interestForCar) {
		this.interestForCar = interestForCar;
	}
	
	
	public int getEMI(int loanAmount, int loanTerm, double interestRate) {

		interestRate = interestRate / 12 / 100;
		double monthlyEMI = loanAmount * interestRate* ((Math.pow((1 + interestRate), loanTerm) / (Math.pow((1 + interestRate), loanTerm) - 1)));

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
