package com.myproject.something;

public class UpperOrLower {

	public static void main(String[] args) {
		char ch = 'r';		
		if(ch>='a' && ch<='z')
		{	System.out.print("Lower case data...");
		}
		else if(ch>='A' && ch<='Z')
		{	System.out.print("Upper case data");
		}
		else if(ch>='0' && ch<='9')
		{	System.out.println("This is Digit");
		}
		else
		{	System.out.println("Special Character");			
		}
	}


}
