package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


import basics.Student;


public class SerializeStudent {

	
		static int count=1; 
		public static Student setInfo()
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter details of student "+count);
			Student student=new Student();
			student.setName(scanner.nextLine());
			student.setRoll(scanner.nextInt());
			student.setFees(scanner.nextDouble());
			count++;
			return student;
		}
		public static void main(String[] args) {
			
			ArrayList<Student> std=new ArrayList<>();
			std.add(setInfo());
			std.add(setInfo());
			
			try {
				FileOutputStream fileoutput=new FileOutputStream("D:\\program\\Student.txt");
				ObjectOutputStream objectouput=new ObjectOutputStream(fileoutput);		
				
				objectouput.writeObject(std);
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
