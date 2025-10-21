package com.myproject.something;

public class LogicalOr {

	public static void main(String[] args) {	
		String location1 = "hyd";  
		boolean res1 = location1.equals("hyd") || location1.equals("hyderabad");
		System.out.println("Your location Available..."+res1);
			
		String location2 = "nrt";  
		boolean res2 = location2.equals("peta") || location1.equals("narasaraopet");
		System.out.println("Your location Available..."+res2);
		}


}

//condition1 || condition2 
//Here the second condition execution depends on first condition 
// 		if the first condition is false then only second condition executed.
// 		if the first condition is true then second condition not executed.
//ex-3: boolean status = true;
//System.out.println(!status);

