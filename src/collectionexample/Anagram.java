package collectionexample;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Anagram {

	private void checkAnagram(String s1, String s2) {
		int count=0;
		char[] first=s1.toCharArray();
		char[] second=s2.toCharArray();
		
		TreeSet<Character> tree1=new TreeSet<>();
		
		for (int i = 0; i < first.length; i++) {
			tree1.add( first[i]);
		}
		//System.out.println(tree1);
		
		TreeSet<Character> tree2=new TreeSet<>();
		for (int j = 0; j < second.length; j++) {
			tree2.add(second[j]);
		}
		//System.out.println(tree2);
		
		
		if(tree1.equals(tree2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
	}

	
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		Anagram a=new Anagram();
		a.checkAnagram(scanner.next(),scanner.next());
		a.checkAnagram(scanner.next(),scanner.next());
		
		scanner.close();
	}
}
