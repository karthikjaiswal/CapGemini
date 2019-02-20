package examples;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

	Scanner sc=new Scanner(System.in);
	
	private void mergeArrays(double[] array1, double[] array2) {
		int length=(array1.length+array2.length);
		int count=0;
		double result[]=new double[length];
		for (int i = 0; i < array1.length; i++) {
			result[i]=array1[i];
			count++;
			
		}
		for (int i = 0; i < array2.length; i++) {
			
			result[count++]=array2[i];
			
		}
		Arrays.sort(result);
		for (int i = 0; i < result.length; i++) {
			
		System.out.println(result[i]);
		}
	}
	private double[] inputArray() {
		// TODO Auto-generated method stub
		System.out.println("enter size");
		int size=sc.nextInt();
		double array[]=new double[size];
		System.out.println("enter elements");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextDouble();
		}
		Arrays.sort(array);
		return array;
		
		
	}
	
	public static void main(String[] args) {
		
		MergeArrays m=new MergeArrays();
		m.mergeArrays(m.inputArray(),m.inputArray());

	}

}
