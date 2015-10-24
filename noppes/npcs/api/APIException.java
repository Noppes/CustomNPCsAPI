package noppes.npcs.api;

public class APIException extends RuntimeException {

	public APIException(String message, Object... obs){
		super(String.format(message, obs));
	}
}
