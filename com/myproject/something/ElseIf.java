package com.myproject.something;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) 
	{	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your location........");
		String location = scanner.next();
		if (location.equals("hyd") || location.equals("sec"))
		{	System.out.println("Visit Charminar ");
		}
		else if (location.equals("gnt") || location.equals("guntur"))
		{	System.out.println("Taste the Chilli..");
		}
		else if (location.equals("vij") || location.equals("bzw"))
		{	System.out.println("Visit Durga temple..");
		}
else if (location.equals("viz") || location.equals("vsk"))
		{	System.out.println("Visit beach....");
		}
		else
		{	System.out.println("you place is not tourist place");
		}
		scanner.close();
	}

}
