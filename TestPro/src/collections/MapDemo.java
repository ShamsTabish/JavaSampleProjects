package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> mapOfName=new TreeMap<Integer,String>();
		
		mapOfName.put(2,"Ramya");
		mapOfName.put(4,"Sakshi");
		
		mapOfName.put(1, "Sumit");
		mapOfName.put(3,"Roy");
		mapOfName.put(5,"Saurabh");
		mapOfName.put(6,"Surendra");
		
		
		Set<Entry<Integer,String>> entries=mapOfName.entrySet();
		
		Iterator<Entry<Integer,String>> itr=entries.iterator();
		
		while(itr.hasNext()){
			Entry<Integer,String> pair=itr.next();
			System.out.println(pair.getKey()+"   :   "+pair.getValue());
		}
		
		for(Integer key:mapOfName.keySet()){
			System.out.println("Key: "+key+" => "+" Value: "+mapOfName.get(key));
		}
		
		
	}

}
