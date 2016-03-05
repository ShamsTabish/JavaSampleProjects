package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays2D {
	public static void main(String[] args) {
		String [][]timetable={{"Android","Android","Java"},{"OS","HTML5","CSS"}};
		for(int row=0;row<2;row++){
			for(int column=0;column<3;column++){
				System.out.print("\t"+timetable[row][column]);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(String row[]:timetable){
			for(String cell:row){
				System.out.print("\t"+cell);
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println();
		
	}
	
}
/*
		Mon			Tue			Wed
	1	Android		Android		Java
	2	OS			HTML5		CSS


*/