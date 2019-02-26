package list;

import java.util.ArrayList;


public class CreateArrayList  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList animals=new ArrayList();
		animals.add("harry");
		animals.add(100);
		animals.add(10078.26);
		animals.add("potter");
		
		System.out.println(animals);
		System.out.println(animals.get(2));
		
		animals.add(2, "Snake");
		System.out.println(animals);
		System.out.println(animals.get(2));
	}

}
