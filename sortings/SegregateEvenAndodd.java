package sortings;

import java.util.Arrays;

public class SegregateEvenAndodd {
	public static void segregateEvenAndodd(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			if(arr[left]%2==0)
			{
				left++;
				
			}
			else if(arr[right]%2!=0)
			{
				right--;	
			}
			else
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4};
		segregateEvenAndodd(arr);
		System.out.println(Arrays.toString(arr));

	}

}
