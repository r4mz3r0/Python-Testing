package javaTestAutomation;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.lang.*;
import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	public void test_is_triangle_1() {
		assertTrue(Triangle.isTriangle(3,4,5));
	}
	
	@Test
	public void test_is_triangle_2() {
		assertTrue(Triangle.isTriangle(5,12,13));
	}
	@Test
	public void test_is_triangle_3() {
		assertTrue(Triangle.isTriangle(5,13,12));
	}
	@Test
	public void test_is_triangle_4() {
		assertTrue(Triangle.isTriangle(12,5,13));
	}
	@Test
	public void test_is_triangle_5() {
		assertTrue(Triangle.isTriangle(12,13,5));
	}
	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(TriangleTest.isTriangle(5,7,13));
	}
	@Test
	public void test_is_NOT_triangle_2() {
		assertFalse(Triangle.isTriangle(5,13,7));
	}
	@Test
	public void test_is_NOT_triangle_3() {
		assertFalse(Triangle.isTriangle(13,5,7));
	}
	@Test
	public void test_is_NOT_triangle_4() {
		assertFalse(Triangle.isTriangle(13,7,5));
	}
	@Test
	public void test_is_NOT_triangle_5() {
		assertFalse(Triangle.isTriangle(13,7,5));
	}
	@Test
	public void test_is_NOT_triangle_6() {
		assertFalse(Triangle.isTriangle(5,9,3));
	}
	@Test
	public void test_is_NOT_triangle_7() {
		assertFalse(Triangle.isTriangle(1,2,-1));
	}
	
	@Test 
	public void test_main_program_1() {
		ByteArrayInputStream in = new ByteArrayInputStream("\5\n12\n13\n".getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(out)); 
		
		String consoleOutput = "Enter side1: \n";
		consoleOutput += "Enter side 2: \n"; 
		consoleOutput += "Enter side 3: \n"; 
		consoleOutput += "This is a Triangle. \n"; 
		
		assertEquals(consoleOutput, out.toString()) ;
	} 

}
