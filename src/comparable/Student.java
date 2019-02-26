package comparable;

public class Student implements Comparable<Student>{
	public int age,roll;
	String name;
	Student(int age,String name, int roll)
	{
		this.age=age;
		this.name=name;
		this.roll=roll;
	}

	@Override
	public int compareTo(Student st) {

		if(age==st.age)
			return 0;
			else if(age>st.age)
				return 2;
			else
				return -2;
		
	}

}
