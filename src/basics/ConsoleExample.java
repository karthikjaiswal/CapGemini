package basics;

public class ConsoleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=System.console().readLine();
		System.out.println(s);
		char[] pass=System.console().readPassword();
		System.out.println(pass);
	}

}
