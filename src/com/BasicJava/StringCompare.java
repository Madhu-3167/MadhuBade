package com.BasicJava;

public class StringCompare {

	public static void main(String[] args) {
		
		String string1="LiveTech";
		String string2="LiveTech";
		
		//if(string1==string2)
		if(string1.equals(string2))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are not Equal ");
		}
		
		System.out.println(" *********************** ");
		
		String string3="LiveTech ";
		String string4="LiveTech";
		
		if(string3.equals(string4))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are not Equal ");
		}
		
		System.out.println(" ##################### ");
				
		String string5="LiveTech";
		String string6="Livetech";
		
// Equal Method checks for the exact match case of the characters of the String
		if(string5.equals(string6))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are not Equal ");
		}
		
		System.out.println("***************************");
		
// EqualsIgnoreCase method checks for the same characters of the String but it
		// will ignore the UpperCase and LowerCase letters of the strings 
		if(string5.equalsIgnoreCase(string6))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
				
		System.out.println(" =================================== ");
		
		String string7="LiveTech";
		String string8="Tech";
		
// contains method check's for the existence of the characters of the String  	
		if(string7.contains(string8))
		{
			System.out.println(" String Existing ");
		}
		else
		{
			System.out.println(" String not Existing ");
		}
		
		System.out.println(" ********************* ");
		
		int string7Length=string7.length();
		System.out.println(" The length of the String is : "+string7Length);
		
		int string8Length=string8.length();
		System.out.println(" The length of the String is : "+string8Length);
		
		//if(string7.length()>string8.length())
		if(string7Length>string8Length)
		{
			System.out.println("String7 is greater than String8 ");
		}
		else
		{
			System.out.println("String8 is greater than String7 ");
		}
						
	}

}
