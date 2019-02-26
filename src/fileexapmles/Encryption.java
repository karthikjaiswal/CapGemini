package fileexapmles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryption {

	public static void main(String[] args) {
		
			Encryption e=new Encryption();
			e.encryptionAlgorithm();
		
		
	}

	private void encryptionAlgorithm() {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fileInputStream2=new FileInputStream("D:\\program\\key.txt");
			char key=(char)fileInputStream2.read();
			System.out.println(key);
			FileInputStream fileInputStream1=new FileInputStream("D:\\program\\message.txt");
			int i=0;
			
			StringBuilder message=new StringBuilder();
			while((i= fileInputStream1.read())!= -1 )
			{
				message.append((char)i);
			}
			String s=message.toString();
			char[] letters=new char[s.length()];
			StringBuilder en=new StringBuilder();
			for(int j = 0;j < letters.length;j++)
			{
				en.append((char)(byte)letters[j]+key);
			}		
			FileOutputStream fileoutput=new FileOutputStream("D:\\program\\encryptedfile.txt");
			
			fileInputStream1.close();
			fileInputStream2.close();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
