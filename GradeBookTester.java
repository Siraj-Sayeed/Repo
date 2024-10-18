import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook one;
	private GradeBook two;

	@BeforeEach
	void setUp() throws Exception {
		one = new GradeBook(5);
		two = new GradeBook(5);
		
		one.addScore(60.9);
		one.addScore(32.2);
		
		two.addScore(91.1);
		two.addScore(70.6);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		one = null;
		two = null;
	}
	@Test
	void testAddScore() {
				
		assertTrue(one.toString().equals("60.9 32.2 0.0 0.0 0.0 "));
		assertTrue(two.toString().equals("91.1 70.6 0.0 0.0 0.0 "));
	
		assertEquals(2, one.getScoreSize(), .001);
		assertEquals(2, two.getScoreSize(), .001);
		
	}

	@Test
	void testSum() {
		
		assertEquals(93.1, one.sum(), .0001);
		assertEquals(161.7, two.sum(), .0001);
		
	}

	@Test
	void testMinimum() {
		
		assertEquals(32.2, one.minimum(), .001);
		assertEquals(70.6, two.minimum(), .001);
		
	}

	@Test
	void testFinalScore() {
		
		assertEquals(60.9, one.finalScore(), .001);
		assertEquals(91.1, two.finalScore(), .001);

	}

}
