package datastructures;

public class SumofDigits {

	    static int sum(int n) {
	        if (n == 0)
	            return 0;
	        return (n % 10) + sum(n / 10);
	    }

	    public static void main(String[] args) {
	        int num = 92; 
	        int result = sum(num);
	        System.out.println("Sum of digits of " + num + " is " + result);
	    }
	}

