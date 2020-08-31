package Sorting_searching;


//Java program for implementation of Bubble Sort 
class bubbleSort 
{ 
	//int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
	
		for (int i = 0; i < n-1; i++) {
			
		
			for (int j = 0; j < n-1; j++) {
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[i] 
					int temp = arr[j]; 
					//
					//System.out.println("temp " + temp);
					
					arr[j] = arr[j+1]; 
					//System.out.println("j " + arr[j]);
					arr[j+1] = temp; 
					//System.out.println("arrj+1 "   +arr[j+1]);
					//System.out.println("Arri " + n);
				}
				
				
			}
			//System.out.println("Arri " + arr[i);
			//arr[i]++;
		}
	} 

	/* Prints the array */
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		bubbleSort ob = new bubbleSort(); 
		int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		ob.bubbleSort(arr); 
	//	System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra */
