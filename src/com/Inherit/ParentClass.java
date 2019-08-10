package com.Inherit;

public class ParentClass extends GrandParent {

	private void test2()
	{
		System.out.println(" Method test2 executed Successfully ");
	}
	
	public void test3()
	{
		System.out.println(" Method test3 executed Successfully ");
	}
	
	public static void main(String[] args) {
				
		ParentClass p = new ParentClass();
		p.test2();
		p.test1(); 
	}

}
