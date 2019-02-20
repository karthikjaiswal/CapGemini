package arrays;

import java.util.Scanner;

public class Kotak {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		long kotak[][]=new long[2][];
		long customerDetails[]=new long[4];
		long customerDetails1[]=new long[4];
		
		customerDetails[0]=123;
		customerDetails[1]=1222;
		customerDetails[2]=3443;
		customerDetails[3]=2343;
		
		customerDetails1[0]=1238;
		customerDetails1[1]=1252;
		customerDetails1[2]=3473;
		customerDetails1[3]=2353;
		
		kotak[0]=customerDetails;
		kotak[1]=customerDetails1;
		
		for (int i = 0; i < kotak.length; i++) {
			for(int j=0;j < kotak[i].length;j++) {
				
			System.out.println(kotak[i][j]);
			}
		}
		

	}

}
