package Sorting_searching;
//sorting in  descending order 
public class Bubble_sort2 {
static void sort(int arr[])
{
	int n = arr.length;
	
	for(int i = 0; i<n-1; i++)
		for( int j=0;j<n-1;j++)
			if(arr[j]<arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
}
public static void main(String args[])
{
	int arr[] = {1,8,6,5,4, 3 ,1};
	Bubble_sort2.sort(arr);
	
	for(int elm :arr)
	{
		System.out.println(elm + " ");
	}
}
}
