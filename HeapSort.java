package Sorting_searching;

public class HeapSort {
public void sort(int arr[])
{
	int n = arr.length;
	for(int i = n/2-1;i>=0;i--)
		heapify(arr, n,i);
	for(int i = n-1;i>=0;i--)
	{
		int temp = arr[0];
		arr[0]= arr[i];
		arr[i] =temp;
		heapify(arr,i,0);
	}
}
void heapify(int arr[], int n,int i)
{
	int largest = i;
	int  l = 2*i+1;
	int r= 2*i+2;
	if(r<n && arr[l]>arr[largest])
		largest =l;
	if(r<n && arr[r] > arr[largest])
		largest =r;
	if(largest != i)
	{
		int swap = arr[i];
		arr[i] = arr[largest];
		arr[largest] = swap;
		heapify(arr, n, largest);
	}
		
}
static void printArray(int arr[])
{
	int n = arr.length;
	for(int i = 0;i<n;++i)
		System.out.println(arr[i] + " ");
	System.out.println();
	
}
public static void main(String args[])
{
	long startTime = System.nanoTime(); 
	int arr[] = {12,11,13,5,6,7,10,67,43,2,9,12,400};
	int n = arr.length;
	HeapSort ob = new HeapSort();
	ob.sort(arr);
	System.out.println("Sorted array is");
	printArray(arr);
	long estimatedTime = (System.nanoTime() - startTime)/1000000;
	System.out.println("Estimated time (in nanoseconds) to get the "
			+ " numbers: "+estimatedTime);
}
}
