package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import static org.mockito.Mockito.*;
import calculator.Loan;
import calculator.Loan.LoanType;

class LoanTest {
	Loan loan = new Loan();
	int loanAmount;
	int loanTerm;
	double interestRate;
	int EMI;

	@BeforeEach
	void setUp() throws Exception {
		loanAmount = 1000000;
		loanTerm = 2;
		interestRate = 10.5;
		EMI = 506572;

	}

	@Test
	void testGetInterestRate() {
		assertEquals(10.5, loan.getInterestRate(LoanType.valueOf("home".toUpperCase())));
		assertEquals(12.5, loan.getInterestRate(LoanType.valueOf("car".toUpperCase())));
		assertEquals(17.5, loan.getInterestRate(LoanType.valueOf("PERSONAL".toUpperCase())));
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	void doCheckingException() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Invalid LoanType");
		loan.getInterestRate(LoanType.valueOf("BIKE"));
	}
	
	@Test
	void testSetInterestRate() {
		double homeLoan = loan.setInterestRate(LoanType.valueOf("home".toUpperCase()), 19.5);
		double personalLoan = loan.setInterestRate(LoanType.valueOf("personal".toUpperCase()), 44.5);
		assertEquals(loan.getInterestRate(LoanType.valueOf("home".toUpperCase())), homeLoan);
		assertEquals(20.5, loan.setInterestRate(LoanType.valueOf("car".toUpperCase()), 20.5));
		assertEquals(loan.getInterestRate(LoanType.valueOf("PERSONAL".toUpperCase())), personalLoan);

	}

	@Test
	void testGetEMI() {
		assertEquals(506572, loan.getEMI(loanAmount, loanTerm, interestRate));
		assertEquals(0, loan.getEMI(-70000, loanTerm, interestRate));
		assertEquals(0, loan.getEMI(loanAmount, 0, interestRate));
		assertEquals(0, loan.getEMI(loanAmount, loanTerm, 0));
	}

	@Test
	void testgetAmountPayable() {

		assertEquals(1013144, loan.getAmountPayable(loanTerm, EMI));
		assertEquals(0, loan.getAmountPayable(0, EMI));
		assertEquals(0, loan.getAmountPayable(loanTerm, -8900));
	}

	@Test
	void testgetinterestTowardsLoan() {
		assertEquals(13144, loan.getinterestTowardsLoan(loanTerm, EMI, loanAmount));
		assertEquals(0, loan.getinterestTowardsLoan(-9, EMI, loanAmount));
		assertEquals(0, loan.getinterestTowardsLoan(loanTerm, EMI, 0));
		assertEquals(0, loan.getinterestTowardsLoan(loanTerm, 0, loanAmount));

	}
}
