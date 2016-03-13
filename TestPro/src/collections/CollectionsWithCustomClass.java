package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsWithCustomClass {
	public static void main(String[] args) {
		Set <Student> students=new TreeSet<Student>();
		students.add(new Student(1,"Roy"));
		students.add(new Student(2,"Sumit"));
		students.add(new Student(3,"Ramya"));
		students.add(new Student(4,"Saurabh"));
		
		for(Student student:students){
			System.out.println(student);
		}
		System.out.println("------------------");
		List <Student>lst=new ArrayList<Student>();
		lst.add(new Student(1, "Sakshi"));
		lst.add(new Student(2,"Meena"));
		lst.add(new Student(3,"Neha"));
		lst.add(new Student(4,"Sneha"));
		lst.add(new Student(5,"Ajit"));
		lst.add(new Student(6,"Parmeet"));
		
		lst.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		
		for(Student student:lst){
			System.out.println(student);
		}
		
		System.out.println("---------------------");
		lst.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getRollNumber()-o2.getRollNumber();
			}
		});
		
		
		for(Student student:lst){
			System.out.println(student);
		}
		
		
	}
}
class Student implements Comparable<Student>{
	private int rollNumber;
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}