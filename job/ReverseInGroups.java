package job;
import java.util.Arrays;
public class ReverseInGroups {
	public static void reverseInGroups(int[] arr, int N, int K) {
        for (int i = 0; i < N; i += K) {
            int left = i;
            int right = Math.min(i + K - 1, N - 1);
            // Reverse the current group
            
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = arr.length;
        int K = 3;
        reverseInGroups(arr, N, K);
        // Print the modified array
        System.out.println(Arrays.toString(arr));  // Output: [3, 2, 1, 5, 4]
    }
}

