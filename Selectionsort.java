package Sorting_searching;

public class Selectionsort {
static void sort(int arr[])
{
	int n = arr.length;
	for( int i=0;i<n;i++)
	{
		int min = i;
	
		for( int j=0;j<n;j++) {
			
		
			if(arr[j]>arr[min])
			{
				min=j;
				int temp= arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}		
			
			
			}
}
}
public static void main(String args[])
{
	int arr[] = {1,4,6,7,3,2,0,4};
	Selectionsort.sort(arr);
	for(int elm : arr)
	{
		System.out.println(elm + " ");
		
	}
	}
}
