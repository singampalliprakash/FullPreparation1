package com.myproject.something;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int start=(i%2==0)?0:1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(start);
				start=1-start;
			}
			
			System.out.println();

	}

}
}
