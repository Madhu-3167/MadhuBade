package com.BasicJava;

public class IfElseIf_Example {

	public static void main(String[] args) {
		
		int a=60;
		int b=70;
		int c=80;
		
		if(a>b || a>c)
		{
			System.out.println(" a is greater");
		}
		else
			if(b>c)
			{
				System.out.println(" b is greater ");
			}
			else
			{
				System.out.println(" c is greater ");
			}
		

	}

}
