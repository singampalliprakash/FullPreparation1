package com.myproject.something;

public class OperatorPrecedence {

	public static void main(String[] args)
	{	System.out.println(10+10*10-10+10);
		System.out.println(5-5*5/5+5);
		
		System.out.println(7*7+7/7%7-7);
		System.out.println(6- (6+6*6) * 6 / 6 % (6*6) + 6);

		System.out.println(10*10/5+3-1*4/2); 
		System.out.println(10+10/5+3*2*4/2-20);
		System.out.println(10-10*5/2+3-10*4/2); 
	}


}

//Operator Precedence 
//First Priority 	->   ( )	brackets 	
//Second Priority 	->   * 	/   % 
//Third Priority 	->   +  -  

