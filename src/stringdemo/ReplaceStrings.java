package stringdemo;

import java.util.Scanner;

public class ReplaceStrings {
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceStrings r=new ReplaceStrings();
		r.exchangeChar(r.input(),r.input());

	}

	private void exchangeChar(String input1, String input2) {
		
		int n1=input1.length();
		int n2=input2.length();
		
		
//		char[] str1=input1.toCharArray();
//		char[] str2=input2.toCharArray();
//		//int count=0;
//		int length=(str1.length+str2.length);
//		//System.out.println(length);
//		char[] result=new char[length];
//		int i=0;
//		
//			for (int j = 0; j < length ; j++) {
//				 
//				result[i]=str1[j];
//				i++;
//				result[i]=str2[j];
//				i++;
//				
//		}
//			
//			//System.out.println(count);
//			for (int j = 0; j < str2.length; j++) {
//				System.out.println(result[j]);
//		
//		}
//		
	}

	private String input() {
		System.out.println("enter string");
		String s=sc.nextLine();
		return s;
		
	}

}
