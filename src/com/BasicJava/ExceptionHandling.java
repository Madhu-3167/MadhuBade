package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int x=10;
			int y=0;
			int z;
			
			z=x/y;
			System.out.println(" The value of Z is : "+z);
		}
		catch(Exception a)
		{
			System.out.println(" Cannot perform the Operation x/y ");
			System.out.println(" The exepction is :"+a);
		}
	
	}

}
