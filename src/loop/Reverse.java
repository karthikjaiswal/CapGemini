package loop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter any num");
		long n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("rev is:"+rev);
	}

}
