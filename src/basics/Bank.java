package basics;

public class Bank {

	long accNo;
	double balance;
	Bank()
	{
		System.out.println("constructor called");
		
	}
	Bank(long i, double j) {
		this();
		this.accNo=i;
		this.balance=j;
		System.out.println(accNo+"\n"+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b2=new Bank(1256481,343454.33);
		new Bank();
		
		
	}

}
