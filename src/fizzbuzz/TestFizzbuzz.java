package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzbuzz {

	@Test
	void testFizzbuzz0() {
		assertEquals("0", FizzBuzz.fizzBuzz(0));
	}
	
	@Test
	void testFizzBuzz1() {
		assertEquals("1", FizzBuzz.fizzBuzz(1));
	}

}
