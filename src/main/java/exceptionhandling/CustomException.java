package exceptionhandling;

public class CustomException extends Exception {
	
	@Override
	public String getMessage() {
		return "Message from Custom Exception";
	}
}
