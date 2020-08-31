package Sorting_searching;
import java.util.*;
public class Stringrev {
public static void main(String args[])
{
	String original , reverse="";
	Scanner in= new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	original = in.nextLine();
	int length = original.length();
	for(int i = length-1;i>=0;i--)
		reverse = reverse+original.charAt(0)
;
	
	System.out.println("Reverse of the string :" +reverse);
	}
}
