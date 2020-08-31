package Sorting_searching;

public class Sortasc {
public static void main(String args[])
{
int[]	 arr = new  int[] {5,3,2};
	int temp =0;
	//System.out.println("Elements of original array :");
	for( int i =0;i<arr.length;i++)
	{
		//System.out.println(arr[i]);

		//System.out.println(arr[i]+"");
		for( i = 0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					System.out.println(arr[i]);	
					
				
			}
				
				}
			
			
			
		}
		System.out.println();
		//System.out.println("Elements of array");
		for( i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
}
