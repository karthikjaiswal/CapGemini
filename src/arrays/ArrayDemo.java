package arrays;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eneter rows and coloumns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat1=new int[row][col];
		
		System.out.println("eneter rows and coloumns");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int[][] mat2=new int[row1][col1];
		 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("enter the number");
				mat1[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat1[i][j]+" ");
			
			}
			System.out.println();
		}
			
		}

}
