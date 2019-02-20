package exception;

public class PowerBaseException extends Exception {
	public PowerBaseException()
	{
		System.err.println("The base or power is either negative or zero");
	}
}
