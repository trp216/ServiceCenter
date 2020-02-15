package model;
import exceptions.*;

import java.util.ArrayList;

public class Company {
	
	private Turn turns;
	
	private ArrayList<User> users;

	public Company() {
		users = new ArrayList<User>();
		turns = new Turn('A',0);
	}

	public void advanceTurn() {
		turns.updateTurn();
	}
	
	public void addUser(User u) {
		users.add(u);
	}
	
	public User searchUser(String id) throws UserNotFoundException{
		User aux = null;
		boolean found = false;
		for(int i = 0;i<users.size() && !found;i++) {
			if(users.get(i).getId().equals(id)) {
				aux = users.get(i);
				found = true;
			}
		}
		if(aux==null)
			throw new UserNotFoundException(id);
		return aux;
	}
	
	public void assignTurn()
}
