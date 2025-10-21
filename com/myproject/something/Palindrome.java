package com.myproject.something;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp=x;
		int rev=0;
		while(x>0)
		{
			rev=rev*10+x%10;
			x=x/10;
		}
		if(temp==rev)
		{
			System.out.println(+temp+" it is a palindrome number:");
		}
		else
		{
			System.out.println(+temp+" it is not a palindrome number:");
		}

	}

}
