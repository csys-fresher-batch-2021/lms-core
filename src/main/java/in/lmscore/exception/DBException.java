package in.lmscore.exception;

public class DBException extends Exception {

	public DBException(Exception e, String message) {
		super(message, e);
	}

	public DBException(String message) {
		super(message);
	}
}