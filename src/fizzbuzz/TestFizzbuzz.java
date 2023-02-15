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

	@Test
	void testFizzBuzz2() {
		assertEquals("2", FizzBuzz.fizzBuzz(2));
	}
	
	@Test
	void testFizzBuzz4() {
		assertEquals("4", FizzBuzz.fizzBuzz(4));	
	}
	@Test
	void testFizzBuzz3() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3));	
	}
	@Test
	void testFizzBuzz6() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(6));	
	}
	@Test
	void testFizzBuzzM14() {
		assertEquals("-14", FizzBuzz.fizzBuzz(-14));	
	}
	@Test
	void testFizzBuzz5() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));	
	}
}
