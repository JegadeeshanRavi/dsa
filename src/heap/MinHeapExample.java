package heap;
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Creating a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min heap
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(3);
        

        // Removing elements from the min heap
        System.out.println("Min Heap Elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}