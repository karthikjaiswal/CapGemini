package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String args[])
	{
		HashSet<Integer> hashSet=new HashSet<>();
		
		hashSet.add(55);
		hashSet.add(52);
		hashSet.add(45);
		hashSet.add(65);
		hashSet.add(55);
		hashSet.add(55);
		hashSet.add(55);
		
		Iterator<Integer> iterator=hashSet.iterator();
		while (iterator.hasMoreElements()) {
				iterator.nextElement();
			
		}
		
	}
}
