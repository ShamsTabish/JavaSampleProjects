package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import threads.TestMaps;

public class ListDemo {
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add("String");
		l.add(2);
		l.add(new TestMaps());
		
		 Object ele=l.get(1);
		if (ele instanceof Integer) {
			Integer element = (Integer) ele;
			
		}
		
		
		List <String> names=new ArrayList<String>();
		names.add("Akshay");
		names.add("Akshay");
		
		names.add("Anil");
		names.add("Sunil");
		names.add("Saif");
		names.add("Ravina");
		names.add("Aish");
		
		System.out.println(names);
		
		for(String name:names){
			System.out.println("ForEach: "+name);
		}
		Iterator nameIterator=names.iterator();
		while(nameIterator.hasNext()){
			System.out.println("Iterator: "+nameIterator.next());
		}
		for(int i=0;i<names.size();i++){
			System.out.println("With Index: "+names.get(i));
		}
		
		ListIterator<String> lstIterator=names.listIterator();
		
		while(lstIterator.hasNext())
			lstIterator.next();
		
		do{
			System.out.println("List Iterator: "+lstIterator.previous());
		}while(lstIterator.hasPrevious());
		
		
		
		names=new LinkedList<String>();
		names.add(0, "Mahesh");
		
		
	}

}
