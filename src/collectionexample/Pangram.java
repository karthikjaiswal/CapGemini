package collectionexample;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Pangram p=new Pangram();
		p.checkPangram(sc.nextLine());
	}

	private void checkPangram(String string) {
		
		HashSet<Character> hash=new HashSet<>();
		for (int i = 0; i < string.length(); i++) {
			
			if(string.charAt(i)!=' ')
				hash.add(string.charAt(i));
		}
		if(hash.size()==26)
			System.out.println("PANGRAM");
		else
			System.out.println("NOT PANGRAM");
		
		
		
	}

}
