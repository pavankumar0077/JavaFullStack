package com.zensar.JUnitDemo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArithmeticParameterizedTest {
	
	int x;
	int y;
	
	public ArithmeticParameterizedTest(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Parameters
	public static Collection testData() {
		Collection col = Arrays.asList(new Object[][] {
			{12,3},{80,35},{67,9},{44,20},{30,20},{90,10},{20,30},{50,100},{20,2},{10,2}
		});
		return col;
	}
	
	
	@Test
	public void testAdd() {
		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.add(x, y),(x+y));
	}
	
	@Test
	public void testDivide() {
		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.divide(x, y),(x/y));
	}

}
