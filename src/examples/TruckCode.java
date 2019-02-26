package examples;

import java.util.Scanner;

public class TruckCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Tag 'DDXDDD-DD' format");
		String input=scanner.nextLine();
		
		TruckCode truckobject=new TruckCode();
		truckobject.codeAnalyser(input);
		

	}

	private void codeAnalyser(String input) {
		
		if((input.charAt(2)=='A' || input.charAt(2)=='E'|| input.charAt(2)=='I' ||input.charAt(2)=='O'|| input.charAt(2)=='U'|| input.charAt(2)=='Y'))
			System.out.println("Invalid");
		else
		{
			if((input.charAt(0)+input.charAt(1))%2==0  && (input.charAt(1)+input.charAt(3))%2==0 && (input.charAt(3)+input.charAt(4))%2==0 && (input.charAt(4)+input.charAt(5))%2==0 && (input.charAt(5)+input.charAt(7))%2==0 &&   (input.charAt(7)+input.charAt(8))%2==0 ) 
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	
		}

}
