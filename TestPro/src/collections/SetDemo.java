package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> setOfNamesInHash=new HashSet<String>();
		setOfNamesInHash.add("Ajay");
		setOfNamesInHash.add("Ajay");
		setOfNamesInHash.add("Ajay");
		
		setOfNamesInHash.add("Aniket");
		setOfNamesInHash.add("Praful");
		setOfNamesInHash.add("Harshad");
		
		for(String name:setOfNamesInHash)
			System.out.println(name);
		
		System.out.println("---------------------");
		
		Set<String> setOfNamesInTree=new HashSet<String>();
		setOfNamesInTree.add("Ajay");
		setOfNamesInTree.add("Ajay");
		setOfNamesInTree.add("Ajay");
		
		setOfNamesInTree.add("Aniket");
		setOfNamesInTree.add("Praful");
		setOfNamesInTree.add("Harshad");
		
		for(String name:setOfNamesInTree)
			System.out.println(name);
		
		
	}
}
