package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapWx {

	public static void main(String arhs[])
	{
		HashMap<String,String> hashMap=new HashMap<>();
		
		hashMap.put("A", "bob");
		hashMap.put("B", "Alice");
		hashMap.put("C", "John");
		hashMap.put("D", "");
		
		for (Map.Entry m: hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}
}
