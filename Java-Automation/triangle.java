package javaTestAutomation;

import java.util.Scanner; 

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter side 1: ");
		int side_1 = reader.nextInt(); 
		
		System.out.println("Enter side 2: ");
		int side_2 = reader.nextInt(); 
		
		System.out.println("Enter side 3: ");
		int side_3 = reader.nextInt(); 
		
		if(isTriangle(side_1, side_2, side_3)) {
			System.out.println("This is a triangle.");
		}
		else {
			System.out.println("THis is not a triangle.");
		}
		
	}
	// side1 + side2 < side3
	// side1 + side3 > side2 
	// side2 + side3 > side1
	public static boolean isTriangle(int side_1, int side_2, int side_3) {
		if(side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_2 + side_3 > side_1) {
			return(false);
		}else {
			return(true);
		}
		
	}
}
