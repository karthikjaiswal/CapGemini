package comparable;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableEx {

	public static void main(String[] args) {
		
		ArrayList<Student> studentlist=new ArrayList<>();
		
		studentlist.add(new Student(21,"Bob",101));
		studentlist.add(new Student(12,"Alice",102));
		studentlist.add(new Student(10,"Bob",103));
		
		Collections.sort(studentlist);
		
		for (Student st : studentlist) {
			System.out.println(st.roll+" "+st.name+" "+st.age);
		}

	}

}
