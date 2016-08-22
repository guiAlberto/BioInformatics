package Exception;

public class InvalidCodomException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidCodomException(){
		super();
	}
	
	public InvalidCodomException(String message) {
		super(message);
	}


}
