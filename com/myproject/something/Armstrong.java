package com.myproject.something;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=String.valueOf(num).length();    //it will convert the integer into string
		int sum=0;
		int temp=num;
		while(temp>0)
		{
			int digit=temp%10;
			sum+=Math.pow(digit,k);
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("it is a armstrong number");
		}
		else
		{
			System.out.println("it is not a armstrong number");
		}

	}

}
