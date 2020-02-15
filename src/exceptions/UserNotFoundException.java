package exceptions;

public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String id) {
		super("The user with the id "+id+"couldn't be found. It will be added to the database");
	}


}
