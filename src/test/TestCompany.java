package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Company;
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
}
