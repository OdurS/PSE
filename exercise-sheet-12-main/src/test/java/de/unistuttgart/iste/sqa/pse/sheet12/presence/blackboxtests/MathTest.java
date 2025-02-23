package de.unistuttgart.iste.sqa.pse.sheet12.presence.blackboxtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for selected Operation of class {@link Math}.
 */
public class MathTest {

	@Test
	public void exampleTest() {
		assertEquals(1, Math.floorDiv(2, 2));
		assertEquals(0, Math.floorDiv(0, 2));
		assertEquals(0, Math.floorDiv(2, 0));
		assertEquals(1, Math.floorDiv(4, 3));
	}

	// TODO: insert test cases for exercise sheet here.

}
 