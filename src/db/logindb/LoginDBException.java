package db.logindb;

public class LoginDBException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Unauthorized access";
	}
}
