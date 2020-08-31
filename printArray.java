package Sorting_searching;
import java.util.*;
public class printArray {

	
	
	
	
	
	
	
	
	
	
	
	Scanner sc = new Scanner(System.in);
	int [] arr = new int[10];
//int n = arr.length;
	
	
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
		
	} }

}
