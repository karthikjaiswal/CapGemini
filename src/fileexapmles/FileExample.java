package fileexapmles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
			
			FileInputStream	fileinputStream= new  FileInputStream("D:\\program\\demo.txt");
//			System.out.println("enter integer");
//			int n=sc.nextInt();
			System.out.println(fileinputStream.read());
			fileinputStream.close();
		}
		 catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
