package com.myproject.something;

import java.util.Scanner;

public class LoginCheck {

	public static void main(String[] args) 
	{	Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter username");
		String username = s.next();
		System.out.println("Enter password...");
		String password = s.next(); 

		if (username.equals("prakash") && password.equals("prakash@123"))
		{	System.out.println("Login Success welcome to Hyderabad");
		}
		else
		{	System.out.println("Login Fail try with valid details...");
		}
		s.close();
	}


}
