package Exception;

public class InvalidProteinException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidProteinException(){
		super();
	}
	
	public InvalidProteinException(String message) {
		super(message);
	}
}
