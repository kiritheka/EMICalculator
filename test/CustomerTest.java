package try1;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
	Customer customer = new Customer();

	@Test
	void testGetUserChoice() {
		assertEquals(1, customer.getUserChoice());
		assertFalse(customer.getUserChoice()<=3);
	}

	@Test
	void testGetLoanType() {
		assertEquals("HomeLoan", customer.getLoanType(1));
		assertEquals("PersonalLoan", customer.getLoanType(2));
		assertEquals("CarLoan", customer.getLoanType(3));
		assertEquals("Invalid Input", customer.getLoanType(-5));
		assertEquals("Invalid Input", customer.getLoanType(0));

	}
	
}
