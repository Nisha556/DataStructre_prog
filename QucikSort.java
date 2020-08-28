package Sorting_searching;



public class QucikSort {
static int partition(int arr[], int low, int high)
{
	int pivot = arr[high];
	int i = (low-1);
	for(int j = low;j<high;j++)
	{
		if(arr[j] <= pivot)
		{
			i++;
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
		}
	}
	int temp  =arr[i+1];
	arr[i+1] = arr[high];
	arr[high] = temp;
	return i+1;
	
}
static void sort(int arr[] , int low, int high)
{
	if(low < high)
	{
		int pi = partition(arr , low , high);
		sort(arr, low ,high);
		sort(arr, pi+1, high);
		
		
	}
}
public static void main(String args[])
{
	long startTime = System.nanoTime();
	int [] arr = {9,5,4,1,6};
	
	QucikSort.sort(arr, 0, arr.length-1);
	
	for(int elm : arr)
	{
		System.out.println(elm + " ");
		
	}
	long estimatedTime = System.nanoTime() - startTime;
	System.out.println("Estimated time (in nanoseconds) to get the  numbers: "+estimatedTime);
}
}
