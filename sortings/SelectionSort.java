package sortings;

import java.util.Arrays;

public class SelectionSort {
	public static int[] selectionSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
					
				{
					min=j;
				
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {10,4,3,9,8,2};
		int[] result=selectionSort(arr);
		System.out.println(Arrays.toString(result));
		
		

	}

}
