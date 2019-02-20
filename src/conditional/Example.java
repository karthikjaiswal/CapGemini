package conditional;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		if(x%2==0)
			System.out.println("the total is "+(x+10));
		else
			System.out.println("the total is "+(x+15));
	}
}
