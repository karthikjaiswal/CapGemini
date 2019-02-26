package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapEx h=new HashMapEx();
		
		HashMap<String, Integer> hashMap=new HashMap<>();
		
		hashMap=h.display("bob");
		
		
		for(Map.Entry m: hashMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
			
	}

	private HashMap<String, Integer> display(String string) {
		
				int length=string.length();
		
				return null;
	}
	

}
