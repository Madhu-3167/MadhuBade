package com.Inherit;

public class ChildClass extends ParentClass {
	
	private void test4()
	{
		System.out.println(" Method test4 executed Successfully ");
	}
	
	public static void main(String []args)
	{
		ChildClass c = new ChildClass();
		c.test4();
		c.test1();
		
	}

}
