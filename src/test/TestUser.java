package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.User;

class TestUser {

	@Test
	public void testUser() {
		String id = "123456";
		int idtype = 1;
		String firstName = "Toshiro";
		String lastName = "Kang";
		String phone = "333333";
		String dir = "random";

		User u = new User(id,idtype,firstName,lastName,phone,dir);
		
		assertEquals(id, u.getId());
		assertEquals("CEDULA_DE_CIUDADANIA", u.getIdtype());
		assertEquals(firstName, u.getFirstName());
		assertEquals(lastName, u.getLastName());
		assertEquals(phone, u.getPhone());
		assertEquals(dir, u.getDir());
	}

}
