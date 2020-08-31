package Sorting_searching;
//sorting in ascending order 
import java.util.*;
public class Bubble_sort {
	//long startTime = System.nanoTime(); 
 static void bubblesort(int arr[])
{
	 
	int n = arr.length;
	for( int i=0;i<n-1;i++) {
		for(int j = 0;j<n-1;j++) {
		if(arr[j] >arr[j+1])
		{
			int temp = arr[j];
			arr [j] =  arr[j+1];
			arr[j+1] = temp;
			 System.out.print(arr[i]);
		}
		 
	
	 
}
		 for (int k=0; k<=i+1; k++) 
             System.out.print(arr[k]+" "); 
		System.out.println();
	}

    //System.out.print("\nThe bubble sort from the numbers are: ");
   // for (int k = 0; k < arr.length; k++){
      //  System.out.print(arr[k] + " ");
    // }
     System.out.println();
}
public static void main(String args[])
{
	long startTime = System.nanoTime(); 
	int [] arr = {1,4,3,9,2};
	Bubble_sort.bubblesort(arr);
	//System.out.println(arr[3]);
	for(int elm :arr)
	{
		System.out.println(elm + " ");
		
	}
	long estimatedTime = (System.nanoTime() - startTime)/1000000;
	System.out.println("Estimated time (in nanoseconds) to get the  numbers: "+estimatedTime);
}
}
