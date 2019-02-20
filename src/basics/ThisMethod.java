package basics;

public class ThisMethod {
	int num1,num2;
	ThisMethod()
	{
		System.out.println("constructor called using this");
	}
	
	public ThisMethod(int i, int j) {
		this();
		this.num1=i;
		this.num2=j;
		System.out.println(num1+"\n"+num2);
		
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod t=new ThisMethod(12,34);
		new ThisMethod();
	}

}
