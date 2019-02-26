package list;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

public class ArrayListFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer> arraylist=new ArrayList<>();
		
		try {
			Scanner sc=new Scanner(System.in);
			FileWriter fileout=new FileWriter("D:\\program\\arraylist.txt");
			System.out.println("enter input");
			//String input=sc.nextLine();
			String[] num=sc.nextLine().split("-");
			
			//fileout.write();
			sc.close();
			
			FileInputStream fileInputStream=new FileInputStream("D:\\program\\arraylist.txt");
			int i;
			while((i= fileInputStream.read())!= -1 )
			{
				
				if(fileInputStream.read()!='-')
					arraylist.add(i);

			}
			fileout.close();
			fileInputStream.close();
			System.out.println(arraylist);
			
			Object[] array=arraylist.toArray();
			
			Integer[] arr=new Integer[array.length];
			
			for (int j = 0; j < array.length; j++) {
				arr[j]=(Integer)array[j];
			}
			
			for (int j = 0; j < arr.length; j++) {
				
			System.out.println(arr[j]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(arraylist);
	

	}

}
