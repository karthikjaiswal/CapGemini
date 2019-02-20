package basics;

import java.util.Scanner;

public class PlusMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		PlusMin p=new PlusMin();
		System.out.println("entre size");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("eneter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		p.plusMinus(arr);

	}

	private void plusMinus(int[] arr) {
		// TODO Auto-generated method stub
		double pos=0,neg=0,zero=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>0)
			{
				pos++;
			}
			else if(arr[i]<0)
			{
				neg++;
			}
			else
			{
				zero++;
			}
		}
		int n=arr.length;
		
		System.out.println("positive"+(pos/n));
		System.out.println("negative"+(neg/n));
		System.out.println("negative"+(zero/n));
		//System.out.println("positive"+(zero/count3));
	}

}

