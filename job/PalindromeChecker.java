package job;
public class PalindromeChecker {

    public boolean isValidPalindrome(String s, int k) {
        return canBePalindrome(s, 0, s.length() - 1, k);
    }
    private boolean canBePalindrome(String s, int left, int right, int k) {
        while (left<right) {
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                if (k == 0) return false;
              
                return canBePalindrome(s, left + 1, right, k - 1) ||
                       canBePalindrome(s, left, right - 1, k - 1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker(); 
        System.out.println(checker.isValidPalindrome("abcdecba", 1)); // true
        System.out.println(checker.isValidPalindrome("abcdeca", 2));  // true
        System.out.println(checker.isValidPalindrome("acdcb", 1));    // false
    }
}