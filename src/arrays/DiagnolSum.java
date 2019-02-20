package arrays;
import java.lang.Math;
import java.util.Scanner;

public class DiagnolSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of rows:");
		int row=sc.nextInt();
		System.out.println("Enter the no. of coloumns:");
		int col=sc.nextInt();
		
		int matrix[][]=new int[row][col];
		
		if(row!=col)
			System.out.println("Input must be a square matrix");
		else {
		System.out.println("Enter the elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		}
		
		DiagnolSum d=new DiagnolSum();
		d.calculateSum(matrix,row,col);
		System.out.println("here");
		
	}

	private void calculateSum(int matrix[][],int row,int col) {
		int d1 = 0,d2=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) 
	                d1 += matrix[i][j]; 
	  
	            if (i == row - j - 1) 
	                d2 += matrix[i][j];
				
			}
			
			
		}
		if(d1>d2)
		 System.out.println(d1 - d2); 
		else
			System.out.println(d2 - d1); 
		
		
	}

}
