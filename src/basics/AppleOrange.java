package basics;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int s,t,a,b,m,n;
		s=sc.nextInt();
		t=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		m=sc.nextInt();
		n=sc.nextInt();
		int apples[]=new int[m];
		for (int i = 0; i < apples.length; i++) {
			apples[i]=sc.nextInt();
		}
		
		int oranges[]=new int[n];
		for (int i = 0; i < oranges.length; i++) {
			oranges[i]=sc.nextInt();
		}
		
		AppleOrange f=new AppleOrange();
		f.numberFruits(s,t,a,b,apples,oranges);
		
	}

	private void numberFruits(int s, int t, int a, int b, int[] apples, int[] oranges) {
		// TODO Auto-generated method stub
		int applecount=0,orangecount=0;
		for (int i = 0; i < apples.length; i++) {
			int temp1=a+apples[i];
		
			if(temp1>=s && temp1<=t)
			{
				applecount++;
			}
			
		}
		for (int i = 0; i < oranges.length; i++) {
			int temp2=b+oranges[i];
		
			if(temp2>=s && temp2<=t)
			{
				orangecount++;
			}
			
		}
		System.out.println(applecount);
		System.out.println(orangecount);
	}

	

}
