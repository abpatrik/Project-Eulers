package se.patrik.euler;

import static org.junit.Assert.*;
import org.junit.Test;
import se.patrik.euler.EulerCounter;
import se.patrik.exception.WrongNumberOrDivisorSizeException;

public class EulerTest {

	@Test
	public void testForCorrectSum() throws WrongNumberOrDivisorSizeException {

		int result1 = 233168;
		int result2 = 63;

		assertEquals(result1, EulerCounter.eulerCounter(1000, new int [] {5,3}));
		
		assertEquals(result2, EulerCounter.eulerCounter(20, new int [] {5,3,0}));
		assertEquals(result2, EulerCounter.eulerCounter(20, new int [] {5,0,3}));

	}

	@Test(expected=WrongNumberOrDivisorSizeException.class) 
	public void testForWrongNumberOrDivisorSizeException() throws WrongNumberOrDivisorSizeException {

		EulerCounter.eulerCounter(0, new int [] {3,5});

	}
}




