package com.BasicJava;

public class MethodExample2 {
	
	int a=10;
	int b=5;
	int c;
	
// Global Variables can be accessed in the all the methods in the Current Class
// Global Variables can also be accessed in Other Classes	

	public void add()
	{				
		c=a+b;
		System.out.println(" The addition of two numbers is : "+c);
	}
	
	public void subtraction()
	{
		c=a-b;
		System.out.println(" The Subtraction of Two numbers is : "+c);
	}
	
	public void multiplication()
	{
		c=a*b;
		System.out.println(" The multiplication of Two numbers is : "+c);
	}
	
	public void division()
	{
		int a=50;
		int b=10;
		int c;
		
		// Local Variables access is limited to the Current Method Only
// These variables cannot be accessed OutSide the current Method and cannot be
		// accessed even in other Methods of the same Class
// These variables cannot be accessed in other Classess directly - but can be
		// used if the Method is called 
		
		c=a/b;
		
		System.out.println(" The division of Two numbers is : "+c);
	}
	
	public static void main(String[] args) {
		
		MethodExample2 m = new MethodExample2();
		m.add();
		
		MethodExample2 m1 = new MethodExample2();
		m.subtraction();
		m.multiplication();
		m.division();
		m1.add();
	}
}
