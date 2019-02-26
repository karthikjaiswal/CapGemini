package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import basics.Student;

public class SerializeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName("Alice");
		//student.setRoll(100);
		student.setFees(1045);
		try {
			FileOutputStream fileoutput=new FileOutputStream("D:\\program\\objectState.txt");
			ObjectOutputStream object=new ObjectOutputStream(fileoutput);
			
			object.writeObject(student);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
