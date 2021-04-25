package javaTestAutomation;

import java.util.Scanner; 

public class Triangle {
	
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
			System.out.println("This is not a triangle.");
		}
		reader.close(); 
		
	}
	// side1 + side2 < side3
	// side1 + side3 > side2 
	// side2 + side3 > side1
	public static boolean isTriangle(double a, double b, double c) {
		if((a + b > c) &&
		   (a + c > b) && 
		   (b + c > a)) {
			return(true);
		}else {
			return(false);
		}
		
	}
}
