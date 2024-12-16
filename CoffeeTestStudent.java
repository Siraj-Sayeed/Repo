import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {
	
	Coffee one, two, three;

	@BeforeEach
	void setUp() throws Exception {
		one = new Coffee("black coffee", Size.LARGE, false, false);
		two = new Coffee("extra shot", Size.SMALL, true, false);
		three = new Coffee("extra shot and syrup", Size.MEDIUM, true, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		one = two = three = null;
	}

	@Test
	void testCalcPrice() {
		
		assertEquals(3.0, one.calcPrice(), .01);
		assertEquals(2.5, two.calcPrice(), .01);
		assertEquals(3.5, three.calcPrice(), .01);
		
	}
	
	@Test
	void testEquals() {
		
		assertTrue(one.equals(new Coffee("black coffee", Size.LARGE, false, false)));
		assertTrue(!one.equals(two));
		assertTrue(!three.equals(new Coffee("extra shot and Syrup", Size.MEDIUM, true, true)));
		
	}

}
