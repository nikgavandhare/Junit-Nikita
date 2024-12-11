package MyPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStrtest {

	// create obj of class
	
	ReverseStr obj= new ReverseStr();
	
	
	@Test
	void test_Reversestr_OneWord() 
	{
	
		assertEquals("avaj", obj.Reversestring("java"));
		
	}
	
	
	@Test
	void test_ReverseStr_MultipleWord()
	{
		
		assertEquals("atikin",obj.Reversestring("nikita") );
	}

}
