package Recursion;
//finite loop
public class recprog1 {
static int count =0;
static void p()
{
	count++;
	if(count <=5)
	{
		System.out.println("hello" +count);
		p();
	}
}
public static void main(String args[])
{
	p();
}
}
