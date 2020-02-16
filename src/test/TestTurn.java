package test;

import model.Turn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTurn {

	@Test
	public void testTurn() {
		char l = 'A';
		char n = 1;
		Turn t = new Turn(l,n);
		
		assertEquals('A', t.getActualLetter());
		assertEquals(1, t.getActualNumber());
	}

}
