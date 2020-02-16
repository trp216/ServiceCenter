package model;
import exceptions.*;

import java.util.ArrayList;

public class Company {
	
	private ArrayList<Turn> turns;
	
	private ArrayList<User> users;
	
	private char[] letter;
	private int[] number;

	public Company() {
		users = new ArrayList<User>();
		turns = new ArrayList<Turn>();
		letter = new char[26];
		number = new int[99];
		fillNumbers();	
	}
	
	public void fillNumbers() {
		for(int i=0;i<number.length;i++) {
			number[i]=i+1;
		}
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

	public void fillLetters() {
		for ( int i=0; i<letter.length; i++) {
			letter[i] = (char) ('A' + i);
		}
	}
	
	public Turn getLastTurn() throws NoTurnsException {
		
		int i=0;
		if(turns.get(i)!=null) {
			while(turns.get(i+1)!=null) {
				i++;
			}
		}
		else
			throw new NoTurnsException();
		return turns.get(i);
		
	}
	
	public String getNextTurn() throws NoTurnsException {
		String msg = "";
		try{if(getLastTurn().getActualNumber()==99 && getLastTurn().getActualLetter()!='Z') {
			int i = 0;
			boolean found = false;
			while(i<letter.length && !found) {
				if(letter[i]==getLastTurn().getActualLetter()) {
					found = true;
				}
				else
					i++;
			}
			msg = letter[i+1]+Integer.toString(number[0]);
		}
		else if(getLastTurn().getActualNumber()==99 && getLastTurn().getActualLetter()=='Z') {
			msg = letter[0]+Integer.toString(number[0]);
		}
		else {
			msg = getLastTurn().getActualLetter()+Integer.toString(getLastTurn().getActualNumber()+1);
		}}catch(NoTurnsException nt) {
			msg = letter[0]+Integer.toString(number[0]);
		}
		return msg;
	}
	
	public String getActualTurnMsg() throws NoTurnsException {
		return getLastTurn().getActualLetter()+Integer.toString(getLastTurn().getActualNumber());
	}
	
	public void advanceTurn(boolean inLine, String id) throws NoTurnsException, UserNotFoundException {
		String nt = getNextTurn();
		char l = nt.charAt(0);
		String n = nt.substring(1);
		int num = Integer.parseInt(n);
		Turn t = new Turn(l,num);
		turns.add(t);
		searchUser(id).setUturn(t);
	}

	public ArrayList<Turn> getTurns() {
		return turns;
	}

	public void setTurns(ArrayList<Turn> turns) {
		this.turns = turns;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public char[] getLetter() {
		return letter;
	}

	public void setLetter(char[] letter) {
		this.letter = letter;
	}

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}
	
	
}
