package exception;

import java.util.Scanner;

public class PowerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int base[]=new int[n];
		System.out.println("enter base array");
		for (int i = 0; i < base.length; i++) {
			base[i]=sc.nextInt();
		}
		int power[]=new int[n];
		System.out.println("enter power array");
		for (int i = 0; i < power.length; i++) {
			power[i]=sc.nextInt();
		}
		PowerException p=new PowerException();
		System.out.println(p.power(base,power));

	}

	public double power(int[] base, int[] power) {
		double p=0;
		
		for (int i = 0; i < power.length; i++) {
			if(base[i]<0 || power[i]<0)
			{
				try
				{
					throw new PowerBaseNegativeException();
				}
				catch(PowerBaseNegativeException e){
					System.out.println(e);
				}
			}
			else if(base[i]==0 && power[i]==0)
			{
				try
				{
					throw new  PowerBaseZeroException();
				}
				catch(PowerBaseZeroException  e){
					System.out.println(e);
				}
			}
			else
			{
				p=Math.pow(base[i],power[i]);
			}
		}
		return p;
		// TODO Auto-generated method stub
		
		
	}

}
