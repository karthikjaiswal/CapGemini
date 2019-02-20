package examples;

import java.util.Scanner;

public class SevenArray {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SevenArray s=new SevenArray();
		
		s.moveToRightSide(s.inputArray());
	}

	private void moveToRightSide(double[] array) {
		// TODO Auto-generated method stub
		int length=array.length;
		int count=0;
		double result[]=new double[length];
		for (int i = 0; i < length; i++) {
			
				
			if(array[i]==7 )
				count++;
			else
				result[i]=array[i];
				
		}
		
	
		int temp=result.length;
		
		for(int j=temp; j < count;j++)
		{
			result[j]=7;
		}
		for (int k = 0; k < result.length; k++) {
			
		System.out.println(result[k]);
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
			return array;
			
			
		}

		
	}
	


