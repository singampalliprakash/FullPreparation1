package com.myproject.something;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = true;

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}


//By using StringBuilder
//String str = "madam";
//
//String reversed = new StringBuilder(str).reverse().toString();
//
//if (str.equals(reversed)) {
//    System.out.println(str + " is a Palindrome");
//} else {
//    System.out.println(str + " is NOT a Palindrome");
//}

