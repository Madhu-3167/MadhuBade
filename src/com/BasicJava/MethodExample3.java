package com.BasicJava;

public class MethodExample3 {

int employeeId;
String employeeName;

 void insertData(int id,String name)
 {
	 employeeId=id;
	 employeeName=name;
 }
 
 void displayInformation()
 {
	 System.out.println("Employee id is :"+employeeId);
	 System.out.println("Employee name is :"+employeeName);
 }
 
 public static void main(String []args)
 {
	 MethodExample3 m = new MethodExample3();
	 
	 m.insertData(101, "Srini");
	 m.displayInformation();
	 
	 m.insertData(102, "vas");
	 m.displayInformation();
	 
 }

  


}
