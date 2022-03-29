package com.zensar.JUnitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ArithmeticTest {

	Arithmetic arithmetic = null;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside beforeClass()");
	}

	@Before
	public void before() {
		this.arithmetic = new Arithmetic();
	}

	@After
	public void after() {
		this.arithmetic = null; // Use @Afer annotation when you want to make it null and use again with another
								// test case
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Inside afterClass()");
	}

	@Test
	public void testAdd() {
//		Arithmetic arithmetic = new Arithmetic(); // to avoid every time creating object use @Before annotation
		assertEquals(arithmetic.add(5, 10), 15);
	}

	@Test
	@Ignore("Not ready to execute") // If you want to ignore any test case due to some reason then use @Ignore annotation
	public void testAdd2() {
//		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.add(50, 20), 70);
	}

	@Test(timeout = 1000) // Test Case must be run in 1 sec if not test case will be failed
	public void testDivide() {
//		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.divide(10, 2), 5);
	}

	@Test
	public void testDivide1() {
//		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.divide(50, 2), 25);
	}
	@Test(expected = ArithmeticException.class) // For any exception to handle use expected 
	public void testDividException() {
		assertEquals(arithmetic.divide(50, 0),5);
	}

}
