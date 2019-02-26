package examples;

import java.util.Scanner;

public class BirthdayParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthdayParty b=new BirthdayParty();
		b.noOfChoclates();
	}
	private void noOfChoclates() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no.of friends");
	int n=sc.nextInt();
	System.out.println("enter the no of choco ");
	int c=sc.nextInt();
	if(c%n==0)
		System.out.println("'YES'");
	else
		System.out.println("'NO'");
	
	}
}
