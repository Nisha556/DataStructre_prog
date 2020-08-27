package Recursion;
import java.util.Scanner;
public class Factorial1 {
	public static void main(String args[])
	{
		int n,mul = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Entry any integer");
		n = s.nextInt();
		for(int i = 1; i<=n;i++)
		{
			mul = mul*i;
			
		}
		System.out.println("Factorialof "+n+" :" +mul);
	}

}
