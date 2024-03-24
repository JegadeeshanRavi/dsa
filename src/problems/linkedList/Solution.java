package problems.linkedList;


class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        for (int i = 1; i <= k; i++) {
            while (temp != null) {
                if (temp.next != null) {
                    prev = temp;
                    temp = temp.next;
                }else{
                    break;
                }
            }
            temp.next = head;
            prev.next = null;
            head = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        rotateRight(node1, 2);
    }


}