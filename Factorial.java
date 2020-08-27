package Recursion;

public class Factorial {
static  long  factorial( long n) {
	if(n!=0)
		return n*factorial(n-1);
	else 
		return 1;
	
}
public static void main(String args[])
{
	long number = 173, result;
	result = factorial(number);
	System.out.println(number + " factorial = " +result);
	
}
}
