package job;
import java.util.HashMap;
import java.util.HashSet;
public class PalindromeCheck {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        return set.size() <= 1;
    }
    public static void main(String[] args) {
        PalindromeCheck  obj = new PalindromeCheck();

        boolean result = obj.canPermutePalindrome("aab");

        System.out.println("result : " + result);
    }
}