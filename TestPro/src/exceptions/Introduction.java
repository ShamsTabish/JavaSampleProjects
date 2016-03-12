package exceptions;

import java.util.Scanner;

public class Introduction {
	public static void main(String[] args) {
		int a = 20, b = 3, x = 0, arr[] = new int[2];
		System.out.println("Starting to try executing");

		try {
			x = b / a;
			b = x * 45;
			// Strore x to a file
			arr[1] = x;
		} catch (ArithmeticException ex) {
			System.out.println("Exception while Dividing by 0"+ex);
			System.out.println("Please enter a valid value for a");
			a = new Scanner(System.in).nextInt();
			x = b / a;

		}catch(Exception e){
			System.out.println("Exception "+e);
		}
		finally{
			//Clean up activities here..
			
			System.out.println("Finally Block");
		}
		System.out.println(x);

		System.out.println("This is the end of program");
	}
}
