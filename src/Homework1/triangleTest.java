package Homework1;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	private triangle tri;
	@Test
	public void testIstriangle(){
		tri = new triangle();
		assertEquals(false, tri.isTriangle(3, 4, 7));
	}
	@Test
	public void testEquilateral() {
		tri = new triangle();
		assertEquals(true, tri.equilateral(3, 3, 3));
	}
	@Test
	public void testIsosceles(){
		tri = new triangle();
		assertEquals(false, tri.isosceles(3, 4, 5));
	}
	@Test
	public void testScalene(){
		tri = new triangle();
		assertEquals(true, tri.scalene(3, 2, 1));
	}
}
