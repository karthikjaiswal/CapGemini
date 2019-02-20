package interfaces;

public class Calculator implements Operations {
	
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		c.add(45.0,55.0);
	}

	@Override
	public void add(double n1,double n2) {
		System.out.println("the result is:"+(n1+n2));
		
	}

		public void sub() {
		System.out.println("the subtraction result is:");
		
	}

	@Override
	public void mul() {
		System.out.println("the multiplication result is:");
		
	}
}
