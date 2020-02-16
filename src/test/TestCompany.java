package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Company;

class TestCompany {
	
	private Company c;
	
	public void setupScenary1() {
		c = new Company();
	}

	@Test
	public void testFillNumbers() {
		setupScenary1();
		assertTrue(c.getNumber()[0]==1);
		assertTrue(c.getNumber()[c.getNumber().length-1]==99);
	
		for(int i = 1; i<c.getNumber().length;i++) {
			assertTrue(c.getNumber()[i]==(c.getNumber()[i-1]+1));
		}
	}

}
