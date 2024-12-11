package com.learning;

public class Java_Course implements Course 
{
	@Override    
	public boolean CoursePurchase()
	{
		System.out.println("Java Course Purchased");
		return true;
	}


}
