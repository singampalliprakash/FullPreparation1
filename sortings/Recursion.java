package sortings;

public class Recursion {
	public static int factorialOfNumber(int n)
	{
		if(n==1)
			return 1;
		return n*factorialOfNumber(n-1);
		
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(factorialOfNumber(n));
	}

}
