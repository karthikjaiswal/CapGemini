package loop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1,n=sc.nextInt();
		while(i<=10)
		{
			System.out.println(n+"x"+i+" ="+(n*i));
		i++;
		}
	}

}
