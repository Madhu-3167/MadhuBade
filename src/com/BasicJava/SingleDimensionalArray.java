package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// An array is used to store multiple values
		// An array Size is always fixed / constant / static
		// An array can store only similar dataType value
		// An array cannot  have more values than the size declared
		// An array index always starts with 0
		// dataType arrayName[] = new dataType[size]
		
		double array1[] = new double[4];
		
		array1[0] = 10.1;
		array1[1] = 20.2;
		array1[2] = 30.3;
		array1[3] = 40.4;
		
		/*System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);*/

		//		System.out.println(array1[3]);

		//for(int i=0;i<3;i++)
		for(int i=0;i<array1.length;i++) // length method finds the size of the array
		{
			System.out.println(array1[i]);
		}
		
	}

}
