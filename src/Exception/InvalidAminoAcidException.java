package Exception;

public class InvalidAminoAcidException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAminoAcidException(){
		super();
	}
	
	public InvalidAminoAcidException(String message) {
		super(message);
	}

}
