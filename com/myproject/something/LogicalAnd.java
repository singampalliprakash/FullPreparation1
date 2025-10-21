package com.myproject.something;

public class LogicalAnd {

	public static void main(String[] args) {
		String username = "prakash";
		String password = "prakash@123";
          boolean result = username.equals("prakash") && password.equals("prakash@123");
          System.out.println("Login Result..."+result);
		
       boolean status = username.equals("sathya") && password.equals("prakash@123");
       System.out.println("Login Result..."+status);
	}


}

//condition1 && condition2 
//Here the second condition execution depends on first condition 
//	if the first condition is true then only second condition executed.
//	if the first condition is false then second condition not executed.

