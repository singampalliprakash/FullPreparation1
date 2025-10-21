package com.myproject.something;

public class TernaryOperator {

	public static void main(String[] args) 
	{	int age = 12; 
		String res = age>18 ? "Major":"minor";
		System.out.println(res);

		char gender = 'F';
		String result = gender=='M'?"You are male":"You are female";
		System.out.println(result);

		String country = "india";
		int countryCode = country.equals("india")? 91 : 108;
		System.out.println("your country code..."+countryCode);			
	}

}
//It is a short form of if-else.
//Syntax:     condition ? expression1: expression2; 
//			If the condition is true expression1 will be executed. 
//			If the condition is false expression2 will be executed.

/*Both ternary & if-else are same. 
Ternary operator we can write only single expression. 
if-else we can write block of statements.*/
