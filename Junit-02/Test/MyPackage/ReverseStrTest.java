package MyPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStrTest {

	@Test
	void test() 
	{
		// create obj odf the revesestring class
				 ReverseStr obj= new ReverseStr();
				 ReverseStr obj2= new ReverseStr();	
				 
				 assertEquals("atikiN", obj.Reversestring("Nikita"));
				 
				 //instread above we can do 
				 
				 
				 assertEquals("avaj",obj2.Reversestring("java"));

				 

	}

}


