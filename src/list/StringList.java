package list;

import java.util.ArrayList;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Bhasker");
		names.add("Bhasker");
		names.add("Lavanya");
		names.add("Akshitha");
		
		System.out.println(names);
		names.add(2,null);
		System.out.println(names);
		
		ArrayList<String> names1=new ArrayList<>();
		names1.add("tiger");
		names1.addAll(names);
		
		System.out.println(names1);

	}

}
