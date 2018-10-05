package dd;

public class CustomException extends RuntimeException{
	public CustomException() {
		super();
	}
	
	CustomException(String message){
		super(message);
	}

}
