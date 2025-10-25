package sortings;

import java.util.Arrays;

public class ThirdLargestNumber {
	public static int thirdLargestNumber(int arr[])
	{
		int n=arr.length;
		if (n < 3&& arr==null) {
            System.out.println("Invalid input:Array must contain at least 3 elements and the array not be a null pointer");
            return -1;
        }
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[n-3];
	}

	public static void main(String[] args) {
		int[] arr= {49,7,9,6,3,5};
		int third=thirdLargestNumber(arr);
		System.out.println(third);
	}

}
