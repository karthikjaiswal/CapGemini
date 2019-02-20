package examples;


import java.util.Scanner;

public class GreaterAverage {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GreaterAverage g=new GreaterAverage();
		g.greaterThanAverage(g.inputArray());
						
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
		return array;
		
		
	}

	private void greaterThanAverage(double[] array) {
		// TODO Auto-generated method stub
		//Arrays.sort(array);
		double sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		double average=sum/array.length;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>average)
			System.out.println(array[i]);
			
		}
		
	}

}
