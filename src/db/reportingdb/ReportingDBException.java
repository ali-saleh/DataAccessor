package db.reportingdb;

public class ReportingDBException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Unauthorized access";
	}
}
