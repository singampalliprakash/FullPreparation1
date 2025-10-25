package assignment;

public class Fibnocii {
	    public static void main(String[] args) {
	        int n = 100;
	        int a = 1, b = 1, c = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	}



