package examples;

import java.util.Scanner;


public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int triangle[]=new int[3];
		System.out.println("enter sides ");
		for (int i = 0; i < triangle.length; i++) {
			triangle[i]=sc.nextInt();
			
		}
		RightTriangle r=new RightTriangle();
		r.caculateAngle(triangle);
	}

	private void caculateAngle(int[] triangle) {
		// TODO Auto-generated method stub
		int x=triangle[0],y=triangle[1],z=triangle[2];
		if((x*x)==(y*y+z*z) || (y*y)==(x*x+z*z) || (z*z)==(y*y+x*x))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
