package mypakage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() 
	{
		Calculator c= new Calculator();
		
		int Actualresult= c.add(10,2);
		
		int Expetedresult=12;
		
		
		assertEquals(Expetedresult, Actualresult);
		
	}

}
