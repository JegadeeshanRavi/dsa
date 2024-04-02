package problems.linkedList;

// 2807. Insert Greatest Common Divisors in Linked List
public class GCDLinkedList {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
            ListNode temp = new ListNode(gcd(prev.val, curr.val));
            temp.next = prev.next;
            prev.next = temp;
        }
        return head;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
