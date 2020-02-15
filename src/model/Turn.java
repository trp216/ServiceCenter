package model;

public class Turn {
	
	private char actualLetter;
	private int actualNumber;
	
	public Turn(char actualLetter, int actualNumber) {
		super();
		this.actualLetter = actualLetter;
		this.actualNumber = actualNumber;
	}

	public char getActualLetter() {
		return actualLetter;
	}

	public void setActualLetter(char actualLetter) {
		this.actualLetter = actualLetter;
	}

	public int getActualNumber() {
		return actualNumber;
	}

	public void setActualNumber(int actualNumber) {
		this.actualNumber = actualNumber;
	}

	
}
