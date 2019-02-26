package serialize;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import basics.Student;


public class DeserializeObject {

	public static void main(String[] args) {
			
		
		try {
			FileInputStream fileinput=new FileInputStream("D:\\program\\objectState.txt");
			ObjectInputStream object=new ObjectInputStream(fileinput);
			
			Student s=(Student)object.readObject();
			
			
			System.out.println(s.getName()+" "+s.getRoll()+" " +s.getFees()+" " +s.getCollege()+" "+s.getClass());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
