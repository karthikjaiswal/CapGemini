package stringdemo;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter k");
		int k=sc.nextInt();
		SmallLargeElement s=new SmallLargeElement();
		s.kSmallest(arr,k);
		s.kLargest(arr,k);
	}

	private void kLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		int length=arr.length;
		for (int i = 1; i < length; i++) {
		    for (int j = i; j < 0; j++) {
		     if (arr[j] < arr [j + 1]) {
		      int temp = arr[j];
		      arr[j] = arr[j + 1];
		      arr[j - 1] = temp;
		     }
		    }
		}
	//	Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(arr[length-k]);
		
			}

	private void kSmallest(int[] arr, int k) {
		// TODO Auto-generated method stub
		int length=arr.length;		
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
		
	}

}
