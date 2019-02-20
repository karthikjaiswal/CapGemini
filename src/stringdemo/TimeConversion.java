package stringdemo;

import java.util.Scanner;

public class TimeConversion {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		TimeConversion t=new TimeConversion();
		t.timeConversion(t.input());
	}


	private String input() {
		System.out.println("Enter time in HH:MM:SSAM or PM format");
		String s=sc.nextLine();
		return s;
		
	}


	public void timeConversion(String arr) {
		
		int length=arr.length();
		if(arr.endsWith("PM"))
		{

}
}
}