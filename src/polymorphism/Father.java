package polymorphism;

public class Father {
	public void marriage()
	{
		System.out.println("ROsy");
	}

}
class Son extends Father{
	public static void main(String args[])
	{
		Son s=new Son();
		s.marriage();
	}
}