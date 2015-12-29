package com.digitek.areas;

import org.junit.Assert;
import org.junit.Test;

public class AreasTest {
	@Test
	public void areaSquareTest() {
		Areas ob = new Areas();
		int actualResult = ob.areaSquare(4);
		Assert.assertEquals(16, actualResult);
	}
	
	@Test
	public void areaRectangleTest() {
		Areas ob = new Areas();
		int actualResult = ob.areaRectangle(4,7);
		Assert.assertEquals(28, actualResult);
	}
	
	
	@Test
	public void areaCircleTest() {
		Areas ob = new Areas();
		double actualResult = ob.areaCircle(6);
		Assert.assertEquals(113.03, actualResult,0.1);
	}

}
