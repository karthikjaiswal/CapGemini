package fileexapmles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
			
			FileInputStream	fileinputStream= new  FileInputStream("D:\\program\\demo.txt");
//			System.out.println("enter integer");
			int i;
			while((i= fileinputStream.read())!= -1 )
			{
				System.out.print((char)i);
			}
			
			//fileinputStream.read();
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
