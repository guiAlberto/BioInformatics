package Exception;

public class InvalidRnaException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidRnaException(){
		super();
	}
	
	public InvalidRnaException(String message) {
		super(message);
	}

}
