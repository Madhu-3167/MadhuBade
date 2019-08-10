package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1 {
	
	// User defined methods are written based on TestNG Annotations
	// @Test - represents to a Test Case
	// Any functionality which is under test should be written within @Test only
	// @Test - should be given priority or else the Test cases will be executed
				// based on the alphabetical order of the given TestCase name
	// If a Test case is defined as "enabled=false" - its represents to a false
	   // Test case - during test Run TestNG ignores executing the current Test
	
	@Test(priority=1)
	public void browserLaunch()
	{
		System.out.println(" Firefox Browser Launch ");
	}
	
	@Test(priority=2)
	public void navigateToGmailApplication()
	{
		System.out.println(" Navigated to Gmail Application ");
	}
	
	@Test(priority=3)
	public void logIn()
	{
		System.out.println(" LogIn To Gmail Appliation ");
	}
		
	@Test(enabled=false)
	public void InBox()
	{
		System.out.println(" Testing InBox Functionality ");
	}
	

}
