package com.zensar.JUnitDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ComplexNumber {

	double real, img;

	ComplexNumber(double r, double i) {
		this.real = r;
		this.img = i;
	}
	
	@Parameters
	public static Collection testData() {
		Collection col = Arrays.asList(new Object[][] {
			{5.5, 4},{1.2, 3.5},{67.2,9.1},{44.0,20.5}
		});
		return col;
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		
		ComplexNumber temp = new ComplexNumber(0, 0);

		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
	
		return temp;
	}
	
//	@Test
//	public void testAdd() {
//		ComplexNumber complexNumber = new ComplexNumber(r, i);
//		assertEquals(ComplexNumber.sum(r, i),(r+i);
//		
//	    }


}
