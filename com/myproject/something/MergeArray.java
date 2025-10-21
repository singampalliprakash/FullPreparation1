package com.myproject.something;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
		//take the frist array 1,2,3  & take the second array 4,5,6,7  Merge 
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6,7};
		int[] newArray = new int[arr1.length + arr2.length];
		for(int i=0; i<arr1.length;i++)
		{	newArray[i]=arr1[i];
		}

		for(int j=0;j<arr2.length;j++)
		{	newArray[arr1.length+j]=arr2[j];
		}
		System.out.println(Arrays.toString(newArray));	
    }


}
