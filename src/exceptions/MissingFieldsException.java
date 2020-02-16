package exceptions;

public class MissingFieldsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissingFieldsException() {
		super("User cannot be registered because there's information missing");
	}

}
