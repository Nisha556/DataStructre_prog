package Sorting_searching;

public class Insertionsort {
static void sort(int arr[])
{
	 int n=arr.length;
	
	 for(int i =0;i<6; i++)
	 {
		 int key = arr[0];
	 		int j = i-1;
		
		while(j>=0 && arr[j]>key) {
			arr[j+1] = arr[j];
		
			j = j-1;
			
			arr[j+1] = key;
			System.out.println(arr[j+1]);
		}
		
}
}
public static void main(String args[])
{
	long startTime = System.nanoTime();
	int arr[] = {1,-2,-3,5,20,9};
	Insertionsort.sort(arr);
	for(int elm :arr)
	{
		//System.out.println(elm + " ");
	}
	long estimatedTime = System.nanoTime() - startTime;
	System.out.println("Estimated time (in nanoseconds) to get the  numbers: "+estimatedTime);

	
}
}