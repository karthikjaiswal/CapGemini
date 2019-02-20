package basics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Birthday b=new Birthday();
		System.out.println(b.birthdayCakeCandles(arr));
		
	}

	static int birthdayCakeCandles(int[] arr) {
		// TODO Auto-generated method stub
		int candles=0;
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
		
			if (arr[i] > max) 
	            max = arr[i];
	
		}
		//System.out.println(max);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==max)
				candles++;
		}
		//System.out.println(candles);
		return candles;
	}

}
