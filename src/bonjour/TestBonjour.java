package bonjour;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBonjour {

	@Test
	void testBernard() {
		assertEquals("Bonjour, Bernard.", Bonjour.bonjour("Bernard"));
	}

	@Test
	void testAlice() {
		assertEquals("Bonjour, Alice.", Bonjour.bonjour("Alice"));
	}
	
	@Test
	void testNul() {
		assertEquals("Bonjour, ami.", Bonjour.bonjour(null));
	}

}
