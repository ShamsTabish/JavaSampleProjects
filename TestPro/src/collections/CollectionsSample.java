package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSample {

	public static void main(String[] args) {
		
		//  Part 1
		String []arr={"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","KK","LL"};
		List lst=(Arrays.asList(arr));
		
		ListIterator<String> itr=lst.listIterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		////Part 2 
		
		Set<Person> persons=new TreeSet<Person>();
		persons.add(new Person(21,"Anil"));
		persons.add(new Person(2,"Simmy"));
		persons.add(new Person(26,"Vasu"));
		persons.add(new Person(65,"Sunil"));
		persons.add(new Person(42,"Shahid"));
		
		for(Person p:persons){
			System.out.println(p);
		}
		
	}
}
class Person implements Comparable<Person>{
	public int getAge() {
		return age;
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int age;
	String name;
	@Override
	public int compareTo(Person o) {
		return age-o.age;
	}
}
