package examples;

import java.util.Scanner;

import basics.Student;

public class ObjectPassingDemo {
	Scanner sc=new Scanner(System.in);
	Student s=new Student();

	public static void main(String[] args) {
		Student s1=new Student();
		ObjectPassingDemo obj=new ObjectPassingDemo();

		s1=obj.accept();
		obj.display(s1);
		
	}

	public Student accept() {
		System.out.println("enter student name");
		s.setName(sc.next());
		System.out.println("enter roll no");
		s.setRoll(sc.nextInt());
		System.out.println("enter fees");
		s.setFees(sc.nextInt());
		return s;
	}
	private void display(Student s)
	{
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
	}
	

}
