package TestPackage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Test_Asssert_True_False 
{
	@Test
	void test_true()
	{
		String str="Nikita";
		
		assertTrue(str.equals("Nikita"));   // result true then test pass   
	}
		
	
	@Test
	void test_false()
	{
		String str="Nikita";
		
		assertFalse(str.length()<5);   //result false the  test pass   
		
		
	}
		
	
}
