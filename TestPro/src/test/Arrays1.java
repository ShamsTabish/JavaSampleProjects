package test;

import java.util.Arrays;

public class Arrays1 {
	public void displayArray(int array[]){
		for (int number:array){
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		int numbers[]={23,1,34,56,865,23,22,56,33,55,67,67};
		Arrays1 arrayObject=new Arrays1();
		
		arrayObject.displayArray(numbers);
		
		Arrays.sort(numbers);
		
		int index=Arrays.binarySearch(numbers,33);
		
		
		System.out.println(index+"---------------------"+numbers.length);
		arrayObject.displayArray(numbers);
		
		
	}
}
