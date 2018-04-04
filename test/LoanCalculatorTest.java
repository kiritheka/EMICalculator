package try1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanCalculatorTest {
	LoanCalculator loancalculator = new LoanCalculator();
	int loanAmount;
	int loanTerm;
	double interestRate;
	int roundoff;

	@BeforeEach
	void setUp() throws Exception {
		loanAmount = 1000000;
		loanTerm = 2;
		interestRate = 10.5;
		roundoff = 506572;

	}

	@Test
	void testGetEMI() {
		assertEquals(506572, loancalculator.getEMI(loanAmount, loanTerm, interestRate));
		assertEquals(0, loancalculator.getEMI(0, loanTerm, interestRate));
		assertEquals(-1, loancalculator.getEMI(loanAmount, 0, interestRate));
		assertEquals(0, loancalculator.getEMI(loanAmount, 0, 0));
	}

	@Test
	void testgetAmountPayable() {

		assertEquals(1013144, loancalculator.getAmountPayable(loanTerm, roundoff));
		assertEquals(0, loancalculator.getAmountPayable(0, roundoff));
		assertEquals(0, loancalculator.getAmountPayable(loanTerm, 0));
	}

	@Test
	void testgetinterestTowardsLoan() {
		assertEquals(13144, loancalculator.getinterestTowardsLoan(loanTerm, roundoff, loanAmount));
		assertEquals(-1000000, loancalculator.getinterestTowardsLoan(0, roundoff, loanAmount));
		assertEquals(-1000000, loancalculator.getinterestTowardsLoan(loanTerm, 0, loanAmount));

	}
}
