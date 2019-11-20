package grammar.exception;
public class negativeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public negativeException() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("123");
		System.err.println("Caught");
	}

	public negativeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public negativeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public negativeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public negativeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
