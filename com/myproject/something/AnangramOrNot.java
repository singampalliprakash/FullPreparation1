package com.myproject.something;

public class AnangramOrNot {

    public static boolean areAnagrams(String s, String t) {
        if (s.length() != t.length()) 
        	return false;
        boolean[] matched = new boolean[t.length()]; // track matched chars in t
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j) && !matched[j]) {
                    count++;
                    matched[j] = true; // mark as matched
                    break; // move to next char in s
                }
            }
        }

        return count == s.length();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if (areAnagrams(s, t)) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }
    }
}

