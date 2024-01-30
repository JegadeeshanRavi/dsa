package singlyLinkedList;

public class SinglyLinkedList {
	ListNode head;

	public static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public SinglyLinkedList() {
		head = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		head.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
	}

	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.head = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		sl.head.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		sl.iterate();
		System.out.println("Lenght of current singly linked list " + sl.lengthOfSinglyLinkedList());
		sl.insertNodeInBeginning(new ListNode(6));
		sl.iterate();
		sl.insertIntoLast(new ListNode(7));
		sl.iterate();
		sl.reverseSinglyLinkedList();
		sl.iterate();
		System.out.println("Middle " + sl.middleElement());
	}

	public void iterate() {
		ListNode ln = head;
		while (ln != null) {
			System.out.print(" " + ln.data + " -->");
			ln = ln.next;
		}
		System.out.println("");
	}

	public int lengthOfSinglyLinkedList() {
		int count = 0;
		if (head == null) {
			return 0;
		}
		ListNode ln = head;
		while (ln != null) {
			count++;
			System.out.print(" " + ln.data + " -->");
			ln = ln.next;
		}
		return count;
	}

	public void insertNodeInBeginning(ListNode input) {
		if (input != null && head != null) {
			ListNode node = head;
			input.next = node;
			head = input;
		}
	}

	public void insertIntoLast(ListNode input) {
		if (input != null && head != null) {
			ListNode node = head;
			while (null != node.next) {
				node = node.next;
			}
			node.next = input;
		} else {
			head = input;
		}
	}

	public void insertIntoGivenPosition(ListNode input, int position) {
		ListNode current = head;
//		int counter = 0;
//		while(current != null) {
//			counter++;
//			current = current.next;
//			if(counter == position)
//		}
	}

	public void reverseSinglyLinkedList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (null != current) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public int middleElement() {
		ListNode node = head;
		ListNode slowPtr = node;
		ListNode fastPtr = node;
		while(null != fastPtr && null != fastPtr.next) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr.data;
	}
}
