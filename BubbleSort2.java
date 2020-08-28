package Sorting_searching;

public class BubbleSort2 {
static void sort(int arr[])
{
	int n = arr.length;
	for(int i = 0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				 int tmp = arr[j];
				 arr[j]= arr[j+1];
				 tmp = arr[j+1];
			}
			System.out.println();
		}
	}
}
public static void main(String args[])
{
	long startTime = System.nanoTime(); 
	int[] arr= {1,7,5,20,40,6,30,21,33,42,24,10,34};
	BubbleSort2.sort(arr);
	for(int elm : arr)
	{
		System.out.println(elm);
	}
	long estimatedTime = (System.nanoTime() - startTime)/1000000;
	System.out.println("Estimated time (in nanoseconds) to get the  numbers: "+estimatedTime);
	
}
}
