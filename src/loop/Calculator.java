package loop;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double result;
		System.out.println("enter num1:");
		double n1=sc.nextDouble();
		System.out.println("enter num2:");
		double n2=sc.nextDouble();
		System.out.println("menu\n 1 addition\n 2 sub \n 3 mul \n 4 div");
		System.out.println("enter the operation");
		String n=sc.next();
		switch(n)
		{
		case "+": result=n1+n2;
		System.out.println("the result is:"+result);
		break;
		case "-": result=n1-n2;
		System.out.println("the result is:"+result);
		break;
		case  "*": result=n1*n2;
		System.out.println("the result is:"+result);
		break;
		case "/": result=n1/n2;
		System.out.println("the result is:"+result);
		break;
		default: System.out.println("enter valid operation");
		break;
		}

	

	}
}