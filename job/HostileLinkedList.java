package job;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class HostileLinkedList {
    public static int maxHostileSum(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Two-pointer approach
        int i = 0;
        int j = list.size() - 1;
        int maxSum = Integer.MIN_VALUE;

        while (i < j) {
            int sum = list.get(i) + list.get(j);
            maxSum = Math.max(maxSum, sum);
            i++;
            j--;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Linked List: [5, 4, 1, 2]
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);

        System.out.println("Maximum Hostile Sum: " + maxHostileSum(head)); // Output: 7
    }
}

