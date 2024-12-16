import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlchoholTestStudent {
	
	Alcohol one, two;

	@BeforeEach
	void setUp() throws Exception {
		
		one = new Alcohol("mojito", Size.MEDIUM, true);
		two = new Alcohol("moscow mule", Size.SMALL, false);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		one = two = null;
	}

	@Test
	void testCalcPrice() {
		assertTrue(one.calcPrice() == 3.10);
		assertTrue(two.calcPrice() == 2.0);
	}
	
	@Test
	void testEquals() {
		
		assertTrue(one.equals(new Alcohol("mojito", Size.MEDIUM, true)));
		assertTrue(!one.equals(two));
		
	}

}
