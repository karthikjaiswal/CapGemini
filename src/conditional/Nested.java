package conditional;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter three numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a==b && b==c){
			System.out.println("All three are equal ");
		}
		else if(b>c)
		{
			if(a>c)
				System.out.println("largest number is:"+a);
			
		else if(b>c)
		{
			System.out.println("largest number is:"+b);
		}
		}
		else
		{
			System.out.println("largest number is:"+c);
		}
	}

}
