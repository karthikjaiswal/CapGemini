package bankingdemo;

import java.util.Scanner;

public class Banking {
	long balance;
	public void transactions(long amount)
	{
		balance=balance+amount;
	}
	public void transactions(long amount,long accountno)
	{
		
	}
	public static void main(String[] args) {
		
		Banking b=new Banking();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Choice \n 0.credit \n 1.debit");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case '0':System.out.println("credit"); 
			b.transactions(15000);
				break;
		case '1': b.transactions(15000,112425);
				break;
				
		default:System.out.println("Enter a valid Choice");
		}
	

	}

}
