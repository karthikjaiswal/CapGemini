package examples;

import java.util.Scanner;

public class UploadPhoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=45;
		for(int i=0; i<5; i++)
		{
		
		System.out.println("enter size");
		int w=sc.nextInt();
		int h=sc.nextInt();
		if(w < l || h < l)
		{
			System.out.println("UPLOAD ANOTHER");
		}
		else if(w >= l && h >= l)
		{
			if(w==h)
				System.out.println("ACCEPTED");
			else
				System.out.println("CROOP IT");
		}
		}
	}

}
