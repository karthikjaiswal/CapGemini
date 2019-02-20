package stringdemo;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		String s4="world";
		String s5=new String("world");
		System.out.println (s1.equals(s2));
		System.out.println(s1.startsWith("h"));
		System.out.println(s2.endsWith("l"));
		s2.replace("h","l");
		System.out.println(s2);

	}

}
