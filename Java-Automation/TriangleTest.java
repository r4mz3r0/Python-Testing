package javaTestAutomation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	public void test_is_triangle_1() {
		assertTrue(TriangleTest.isTriangle(3,4,5));
	}
	
	@Test
	public void test_is_triangle_2() {
		assertTrue(TriangleTest.isTriangle(5,12,13));
	}
	@Test
	public void test_is_triangle_3() {
		assertTrueTriangleTest.isTriangle(5,13,12));
	}
	@Test
	public void test_is_triangle_4() {
		assertTrue(TriangleTest.isTriangle(12,5,13));
	}
	@Test
	public void test_is_triangle_5() {
		assertTrue(TriangleTest.isTriangle(3,4,5));
	}
	

}
