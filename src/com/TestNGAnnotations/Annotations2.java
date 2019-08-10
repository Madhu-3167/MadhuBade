package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println(" Gmail application launch ");
	}
	
	@Test(priority=1)
	public void inbox()
	{
		System.out.println(" Testing InBox Functionality ");
	}
	
	@Test(priority=2)
	public void sentMail()
	{
		System.out.println(" Testing sentMail Functionality ");
	}
	
	
	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println(" Testing composeMail Functionality ");
	}
	
	@AfterTest
	public void gmailApplicationClose()
	{
		System.out.println("Gmail Application close");
	}
	
}
