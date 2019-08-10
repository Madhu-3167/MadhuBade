package com.BasicJava;

public class MethodExample1 {
	
	public void test2()
	{
		System.out.println(" Method test2 executed Successfully ");
	}
	
	public static void main(String[]args)
	{
		//ClassName ObjectName
		MethodExample1 m = new MethodExample1();
		m.test1();
		
		MethodExample1 m1 = new MethodExample1();
		m1.test1();
		m1.test2();
		
		//m.test2();
	}

	public void test1()
	{
		System.out.println(" Method test1 executed Successfully ");
	}
	
}
