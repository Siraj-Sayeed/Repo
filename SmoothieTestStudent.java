import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
	
	Smoothie one, two;

	@BeforeEach
	void setUp() throws Exception {
		one = new Smoothie("protein", Size.SMALL, 0, true);
		two = new Smoothie("max fruit", Size.SMALL, 10, false);
	}
	

	@AfterEach
	void tearDown() throws Exception {
		one = two = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(3.5, one.calcPrice(), .01);
		assertEquals(4.5, two.calcPrice(), .01);
	}
	
	@Test
	void testEquals() {
		
		assertTrue(one.equals(new Smoothie("protein", Size.SMALL, 0, true)));
		assertTrue(!one.equals(two));
		
	}

}
