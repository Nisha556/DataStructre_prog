package Recursion;

public class RecursionTest {
private static void recurse(int i)
{
	try {
		recurse(i+1);
		
	}
	catch(StackOverflowError e)
	{
		System.out.println("Recusrion depth on this system" + i + ".");
		
	}
}
public static void main(String args[])
{
	recurse(0);
}
}
