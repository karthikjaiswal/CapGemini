package fileexapmles;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
			
			FileOutputStream	fileOutputStream= new  FileOutputStream("D:\\program\\demo.txt");
			System.out.println("enter name");
			String n=sc.next();			
			byte[] b = n.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();
			System.out.println("done");
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

