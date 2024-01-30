package singlyLinkedList;

import singlyLinkedList.SinglyLinkedList.ListNode;

public class SinglyLinkedListITerateWithPointers {

	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.iterate();
		SinglyLinkedListITerateWithPointers ptr = new SinglyLinkedListITerateWithPointers();
		System.out.println(ptr.returnLastElementInLinkedList(6));
		sl.iterate();
	}

	

	public int returnLastElementInLinkedList(int count) {
		SinglyLinkedList sl = new SinglyLinkedList();
		ListNode startPtr = sl.head;
		ListNode travelledPtr = sl.head;
		int counter = 1;
		while(counter <= count) {
			travelledPtr = travelledPtr.next;
			counter++;
		}
		
		while(travelledPtr != null) {
			startPtr = startPtr.next;
			travelledPtr = travelledPtr.next;
		}
		return startPtr.data;
	}

	public void iterate() {
		SinglyLinkedList sl = new SinglyLinkedList();
		ListNode ln = sl.head;
		while (ln != null) {
			System.out.print(" " + ln.data + " -->");
			ln = ln.next;
		}
		System.out.println("");
	}

}
