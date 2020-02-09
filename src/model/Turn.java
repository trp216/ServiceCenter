package model;

public class Turn {
	
	private char[] letter;
	private int[] number;
	private char actualLetter;
	private int actualNumber;
	
	public Turn(char actualLetter, int actualNumber) {
		super();
		this.actualLetter = actualLetter;
		this.actualNumber = actualNumber;
		letter = new char[26];
		fillNumbers();
		number = new int[99];
	}

	public void fillNumbers() {
		for(int i=0;i<number.length;i++) {
			number[i]=i+1;
		}
	}

	public void fillLetters() {
		for ( int i=0; i<26; i++) {
			letter[i] = (char) ('A' + i);
		}
	}
	
	public String getNextTurn() {
		String msg = "";
		if(actualNumber==99 && actualLetter!='Z') {
			int i = 0;
			boolean found = false;
			while(i<letter.length && !found) {
				if(letter[i]==actualLetter) {
					found = true;
				}
				else
					i++;
			}
			msg = letter[i+1]+Integer.toString(number[0]);
		}
		else if(actualNumber==99 && actualLetter=='Z') {
			msg = letter[0]+Integer.toString(number[0]);
		}
		else {
			msg = actualLetter+Integer.toString(actualNumber+1);
		}
		return msg;
	}
	
	public String getActualTurn() {
		return actualLetter+Integer.toString(actualNumber);
	}
	
	public void updateTurn() {
		String nt = getNextTurn();
		actualLetter = nt.charAt(0);
		String n = nt.substring(1);
		actualNumber = Integer.parseInt(n);
	}
}
