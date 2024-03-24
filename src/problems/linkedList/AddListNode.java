package problems.linkedList;

public class AddListNode {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        ListNode x = addTwoNumbers(node1, node4);
        while(x != null){
            System.out.print(x.val + " ");
            x= x.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int iter = 0;
        ListNode res = new ListNode();
        ListNode prev = null;
        while(l2 != null || l1 != null){
            int val1 = 0;
            if(l1 != null){
                val1 = l1.val;
                l1 = l1.next;
            }
            int val2 = 0;
            if(l2 != null){
                val2 = l2.val;
                l2 = l2.next;
            }
            if(iter == 0){
                res.val = (val1+ val2) % 10;
                carry = (val1 + val2) / 10;
                prev = res;
                iter++;
            }else{
                int added = (val1 + val2 + carry) % 10;
                carry = (val1 + val2 + carry) / 10;
                ListNode node = new ListNode(added);
                prev.next = node;
                prev = node;
            }
        }
        if(carry > 0){
            ListNode node = new ListNode(carry);
            prev.next = node;
        }
        return res;
    }
}
