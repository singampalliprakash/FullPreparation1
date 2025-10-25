package com.myproject.something;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EvenLeftOddRight {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15, 3, 12};

        int left = 0, right = numbers.length - 1;

        while (left < right){
            if (numbers[left] % 2 == 0) {
                // If the left number is already even, move forward
                left++;
            } 
            else if (numbers[right] % 2 != 0) {
                // If the right number is already odd, move backward
                right--;
            } 
            else {
                // Swap when left is odd and right is even
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Rearranged Array (Even left, Odd right): " + Arrays.toString(numbers));
    }


}
