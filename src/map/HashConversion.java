package map;

import java.util.HashMap;
import java.util.HashSet;

public class HashConversion {

	public static void main(String[] args) {
	
		HashConversion h=new HashConversion();
		HashMap<Integer, String> hashMap=new HashMap<>();
		
		hashMap.put(100,"Bob");
		hashMap.put(101,"Alice");
		hashMap.put(102,"John");
		
		HashSet<String> values=new HashSet<>(hashMap.values());
		HashSet<Integer> keys=new HashSet<>(hashMap.keySet());
		
		System.out.println(values);
	
		System.out.println(keys);
		h.mapToSet(hashMap);

	}

	private void mapToSet(HashMap<Integer, String> hashMap) 
	{
		
		
		
	}

}
