package stringdemo;

import java.util.Scanner;

public class CeaserCipher {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		CeaserCipher c=new CeaserCipher();
		StringBuilder en=new StringBuilder();
		en=c.encryptionAlgorithm(c.input(),3);
		c.decryptionAlgorithm(en,3);
		

	}

	private StringBuilder encryptionAlgorithm(String s, int key) {
				
		char[] letters=s.toCharArray();
		StringBuilder encrytedMessage=new StringBuilder();
		for(int i = 0;i < letters.length;i++)
		{
			encrytedMessage.append((char)(byte)(letters[i]+key));
		}
		return encrytedMessage;
	
	}
	private void decryptionAlgorithm(StringBuilder en, int key) {
		String s=en.toString();
		char letters[]=s.toCharArray();
		StringBuilder decryptedMessage=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			decryptedMessage.append((char)(byte)(letters[i]-key));
		}
		System.out.println(decryptedMessage);
		
	}

	
	private String input() {
		String s=sc.nextLine();
		
		return s;
	}

}
