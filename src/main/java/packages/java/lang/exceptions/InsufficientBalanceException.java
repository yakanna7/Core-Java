package packages.java.lang.exceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException() {
		super();
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}

	public InsufficientBalanceException(Throwable cause) {
		super(cause);
	}

	public InsufficientBalanceException(String message, Throwable  cause) {
		super(message, cause);
	}
}
