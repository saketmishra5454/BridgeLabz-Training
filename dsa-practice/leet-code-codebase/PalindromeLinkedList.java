import java.util.Stack;

class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static boolean isPalindrome(ListNode head) {         //Method to find the Palindrome  
        Stack<Integer> stack = new Stack<>();   //taking stack
        ListNode temp = head;

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.val != stack.pop()) return false;
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);

        System.out.println(isPalindrome(head)); // true
    }
}
