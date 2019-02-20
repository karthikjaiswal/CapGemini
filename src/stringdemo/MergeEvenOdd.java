package stringdemo;

import java.util.Arrays;
import java.util.Scanner;

public class MergeEvenOdd {
	Scanner sc=new Scanner(System.in);
	
	private int[] inputArray() {
		// TODO Auto-generated method stub
		System.out.println("enter size");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		
		return array;
		
		
	}
	private void firstEvenLastOdd(int[] inputArray) {
		
		int evenlength=0,oddlength=0;
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i]%2==0)
				evenlength++;
			else
				oddlength++;
		}
		int even[]=new int[evenlength];
		int odd[]=new int[oddlength];
		int c1=0,c2=0;
		for (int i = 0; i < inputArray.length; i++) {
			
				if(inputArray[i]%2==0)
				
					even[c1++]=inputArray[i];
				else
					odd[c2++]=inputArray[i];
		
			
			
		}
		
		
		Arrays.sort(even);
		Arrays.sort(odd);
		for (int i = 0; i < evenlength; i++) {
			
			System.out.println(even[i]);
			
		}
		for (int i = 0; i < oddlength; i++) {
			
			System.out.println(odd[i]);
			
		}
		
//		int count = 0;
//		for (int i = 0; i < inputArray.length; i++) {
//			
//			inputArray[i]=even[i];
//			count++;
//			
//		}
//		for (int i = 0; i < oddlength; i++) {
//		
//			inputArray[count++]=odd[i];
//			
//		}
//		
//		for (int i = 0; i < inputArray.length; i++) {
//			
//		System.out.println(inputArray[i]);
//		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeEvenOdd m=new MergeEvenOdd();
		m.firstEvenLastOdd(m.inputArray());

	}


	

}
