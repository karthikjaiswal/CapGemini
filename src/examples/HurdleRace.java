package examples;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of hurdles");
		int n=sc.nextInt();
		System.out.println("enter hurdles");
		int[] array=new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter initial max height");
		int k=sc.nextInt();
		
		HurdleRace h=new HurdleRace();
		h.potionNeeded(array,k);

	}

	private void potionNeeded(int[] array, int k) {
		
		int length=array.length;
		Arrays.sort(array);
		int max=array[length-1];
		if((max-k)>0)
		System.out.println(max-k);
		else
			System.out.println("0");
	}

}
