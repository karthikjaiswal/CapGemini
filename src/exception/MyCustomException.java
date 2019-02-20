package exception;

public class MyCustomException extends Exception{
	public MyCustomException()
	{
		System.err.println("my custom exception called");
	}

}
