package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Service_purchase.Purchase_Course;
import com.learning.DSA_Course;
import com.learning.Java_Course;
import com.learning.Spring_Boot_Course;

class TestPurchaseCourse {
	
	//create obj of Purchase_Course CLASS
	Purchase_Course obj=new Purchase_Course();

	
	@Test
	void test_PurchaseCourse_Java() 
	{
	
		boolean stutus = obj.Proceed_with_course(new Java_Course());
		
		assertTrue(stutus);
	}
	
	@Test
	void test_PurchaseCourse_SpringBoot() 
	{
	
		boolean stutus = obj.Proceed_with_course(new Spring_Boot_Course());
		
		assertTrue(stutus);
	}
	
	@Test
	void test_PurchaseCourse_DSA() 
	{
	
		boolean stutus = obj.Proceed_with_course(new DSA_Course());
		
		assertTrue(stutus);
	}

}
