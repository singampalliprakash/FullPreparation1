package com.myproject.something;
import java.util.Scanner; 
public class Scanner1{

	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id..."); 		 //111 
		int eid = sc.nextInt();

		System.out.println("Enter emp name..."); 	// prakash
		String ename = sc.next();

		System.out.println("Enter emp salary"); 		//15000.45
		double esal = sc.nextDouble();
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);

		System.out.println("Emp id..."+eid);
		System.out.println("Emp name..."+ename);
		System.out.println("Emp salary..."+esal);
	
		sc.close(); 
	}


}
