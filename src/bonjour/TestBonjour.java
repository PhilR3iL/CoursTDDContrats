package bonjour;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBonjour {

	@Test
	void test() {
		assertEquals("Bonjour, Bernard.", Bonjour.bonjour("Bernard"));
	}

}
