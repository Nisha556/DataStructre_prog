package Sorting_searching;
//sorting in ascending order 
import java.util.*;
public class Bubble_sort {
 static void bubblesort(int arr[])
{
	int n = arr.length;
	for( int i=0;i<n-1;i++)
		for(int j = 0;j<n-i-1;j++)
		if(arr[j] >arr[j+1])
		{
			int temp = arr[j];
			arr [j] =  arr[j+1];
			arr[j+1] = temp;
		}
}
public static void main(String args[])
{
	int [] arr = {1,4,3,9,2};
	Bubble_sort.bubblesort(arr);
	for(int elm :arr)
	{
		System.out.println(elm + " ");
		
	}
}
}
