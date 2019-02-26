package map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapEx {

	public static void main(String arhs[])
	{
		TreeMap<String,String> treeMap=new TreeMap<>();
		
		treeMap.put("A", "bob");
		treeMap.put("B", "Alice");
		treeMap.put("C", "John");
		treeMap.put("D", "");
		
		for (Map.Entry m: treeMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}
}
