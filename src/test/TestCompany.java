package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NoTurnsException;
import model.Company;
import model.Turn;
import model.User;

class TestCompany {
	
	private Company c;
	private User u;
	
	public void setupScenary1() {
		c = new Company();
	}
	
	public void setupScenary2() {
		c = new Company();
		u = new User("09876",4,"Taemin","Lee","58394","random");
		Turn t = new Turn('A',1);
		c.addUser(u);
		c.getTurns().add(t);
	}
	
	public void setupScenary3() {
		c = new Company();
		Turn t1 = new Turn('A',1);
		Turn t2 = new Turn('Z',99);
		c.getTurns().add(t1);
		c.getTurns().add(t2);
	}
	
	public void setupScenary4() {
		c = new Company();
		Turn t1 = new Turn('C',99);
		c.getTurns().add(t1);
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

	@Test
	public void testAddUser() {
		User toAdd = new User("123456",1,"Toshiro","Kang","333333","random");
		
		setupScenary1();
		c.addUser(toAdd);
		assertEquals("123456", c.getUsers().get(0).getId());
		assertEquals("CEDULA_DE_CIUDADANIA", c.getUsers().get(0).getIdtype());
		assertEquals("Toshiro", c.getUsers().get(0).getFirstName());
		assertEquals("Kang", c.getUsers().get(0).getLastName());
		assertEquals("333333", c.getUsers().get(0).getPhone());
		assertEquals("random", c.getUsers().get(0).getDir());
		
		setupScenary2();
		c.addUser(toAdd);
		assertEquals("123456", c.getUsers().get(c.getUsers().size()-1).getId());
		assertEquals("CEDULA_DE_CIUDADANIA", c.getUsers().get(c.getUsers().size()-1).getIdtype());
		assertEquals("Toshiro", c.getUsers().get(c.getUsers().size()-1).getFirstName());
		assertEquals("Kang", c.getUsers().get(c.getUsers().size()-1).getLastName());
		assertEquals("333333", c.getUsers().get(c.getUsers().size()-1).getPhone());
		assertEquals("random", c.getUsers().get(c.getUsers().size()-1).getDir());
	}
	
	@Test 
	public void testGetLastTurn() {
		setupScenary2();
		try {
			assertEquals('A',c.getLastTurn().getActualLetter());
			assertEquals(1,c.getLastTurn().getActualNumber());
		} catch (NoTurnsException e) {
			e.getMessage();
		}
		
		setupScenary3();
		try {
			assertEquals('Z',c.getLastTurn().getActualLetter());
			assertEquals(99,c.getLastTurn().getActualNumber());
		} catch (NoTurnsException e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testGetNextTurn() {
		setupScenary2();
		try {
			assertEquals("A2",c.getNextTurn());
		} catch (NoTurnsException e) {
			e.getMessage();
		}
		
		setupScenary4();
		try {
			assertEquals("D1",c.getNextTurn());
		} catch (NoTurnsException e) {
			e.getMessage();
		}
		
		setupScenary3();
		try {
			assertEquals("A1",c.getNextTurn());
		} catch (NoTurnsException e) {
			e.getMessage();
		}
	}
}
