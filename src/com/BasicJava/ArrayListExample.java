package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<Object>array1 = new ArrayList<>();
		
		array1.add("Selenium");
		array1.add(10);
				
		for(int i=0;i<array1.size();i++)
		{
			System.out.println(array1.get(i));
		}
	}

}
