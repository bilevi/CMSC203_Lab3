import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook gbookA;
	private GradeBook gbookB;
	
	@BeforeEach
	void setUp() throws Exception {
		
		gbookA = new GradeBook(5);
		gbookA.addScore(73);
		gbookA.addScore(82);
		gbookA.addScore(94);
		
		gbookB = new GradeBook(5);
		gbookB.addScore(11);
		gbookB.addScore(100);
		gbookB.addScore(76);
		gbookB.addScore(88);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		gbookA = null;
		gbookB = null;
		
	}

	@Test
	void testAddScore() {
		
		assertTrue(gbookA.toString().equals("73.0 82.0 94.0 "));
		assertTrue(gbookB.toString().equals("11.0 100.0 76.0 88.0 "));
		
		assertEquals(3, gbookA.getScoreSize());
		assertEquals(4, gbookB.getScoreSize());
		
	}

	@Test
	void testSum() {
		
		assertEquals((73+82+94), gbookA.sum(), .001);
		assertEquals((11+100+76+88), gbookB.sum(), .001);
		
	}

	@Test
	void testMinimum() {
		
		assertEquals(73, gbookA.minimum(), .001);
		assertEquals(11, gbookB.minimum(), .001);
		
	}

	@Test
	void testFinalScore() {
		
		assertEquals((82+94), gbookA.finalScore(), .001);
		assertEquals((100+76+88), gbookB.finalScore(), .001);
		
	}

	@Test
	void testGetScoreSize() {

	}

	@Test
	void testToString() {

	}

}
