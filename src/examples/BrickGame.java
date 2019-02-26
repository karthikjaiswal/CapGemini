package examples;

import java.util.Scanner;

public class BrickGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1,sum=0,count=0;
		int m=p*2;
		
		while(sum<n)
		{

			sum=sum+p;
			sum=sum+m;
			p=p+1;
			m=p*2;
			count++;
			if(sum>n)
				break;
			
		}
		System.out.println(sum);
		int temp=sum-n;
		p=temp-p-1;
		System.out.println(count);
//		if(p<=count)
//			System.out.println("patlu");
//		else 
//			System.out.println("motu");
		
	}

}
