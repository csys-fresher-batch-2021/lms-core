package in.lmscore.exception;

public class ValidException extends Exception {

	public ValidException(Exception e, String message) {
		super(message, e);
	}

	public ValidException(String message) {
		super(message);
	}

}
