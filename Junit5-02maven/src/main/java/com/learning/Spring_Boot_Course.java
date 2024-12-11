package com.learning;

public class Spring_Boot_Course implements Course
{
	@Override    
	public boolean CoursePurchase()
	{
		System.out.println("Spring boot Course Purchased");
		return true;
	}


}
