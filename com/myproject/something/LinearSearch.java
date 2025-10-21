package com.myproject.something;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,15,17,19,25,97,37};
		Arrays.sort(numbers);
        int target = 6;
        for(int nums:numbers)
        {
        	if(target==nums)
        	{
        		System.out.println("element is found:"+nums);
        		break;
        	}
        }
        for(int nums:numbers)
        {
        	if(nums%2==0)
        	{
        		continue;
        	}
        	System.out.println("odd numbers:"+nums);
        }
	}

}
