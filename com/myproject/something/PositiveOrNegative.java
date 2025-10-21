package com.myproject.something;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number........");
		int number = scanner.nextInt();
		if (number>0)
		{	System.out.println("your number is positive..");
		}
		else if (number<0)
		{	System.out.println("your number is Negative..");
		}
		else
		{	System.out.println("your number is Zero..");
		}
	}


}
