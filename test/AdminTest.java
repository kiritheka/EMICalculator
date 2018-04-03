package try1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminTest {
	Admin admin = new Admin();

	@Test
	void testGetAdminChoice() {
		assertEquals(1, admin.getAdminChoice());
		assertFalse(admin.getAdminChoice() <= 3);

	}

	@Test
	void testviewOrChangeChoice() {
		assertEquals(1, admin.viewOrChangeChoice());
		assertFalse(admin.viewOrChangeChoice() <= 2);

	}

	@Test
	void testGetandShowInterestRate() {

		assertEquals(10.5, admin.getandShowInterestRate(1, 1), 0.001);
		assertEquals(17.5, admin.getandShowInterestRate(2, 1), 0.5);
		assertEquals(12.5, admin.getandShowInterestRate(3, 1), 0.5);
		
		assertEquals(12.5, admin.getandShowInterestRate(1, 2), 0.5);
		assertEquals(19.5, admin.getandShowInterestRate(2, 2), 0.5);
		assertEquals(14.5, admin.getandShowInterestRate(3, 2), 0.5);

		
		assertEquals(0.0, admin.getandShowInterestRate(4, 1), 0.001);
		assertEquals(0.0, admin.getandShowInterestRate(-1, 2), 0.001);
		assertEquals(0.0, admin.getandShowInterestRate(1, 3), 0.5);
		assertEquals(0.0, admin.getandShowInterestRate(-1, -3), 0.5);


	}

}
