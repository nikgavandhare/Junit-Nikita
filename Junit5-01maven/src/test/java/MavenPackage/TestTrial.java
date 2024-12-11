package MavenPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	
	// create obj of calss shape
	
	Shape obj=new Shape();
	
	@Test
	void test_AreaCircle_supplier()    // here supplier is interface of java it is functional interface so that we can use lamda fun of it to show msg if test fails 
	{
		assertEquals(78.5,obj.CalAreaCircle(5),() -> "Area of Circle is not matching to expected area" );
	}

	@Test
	void test_AreaSquare() 
	{
		assertEquals(144,obj.CalAreaSquare(12),() -> "Area of Square is not matching to expected area" );
	}
	
	@Test
	void test_AreaRectangle() 
	{
		assertEquals(72,obj.CalAreaRectangle(12, 6),() -> "Area of Rectangle is not matching to expected area" );
	}
	
}
