package graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

	public static void main(String[] args) {
		GraphWithLinkedList graph = new GraphWithLinkedList(5);
		GraphWithLinkedList data = graph.getGraph();
		bfsTraversal(0, data);
	}

	public static void bfsTraversal(int start, GraphWithLinkedList data) {
		boolean[] visited = new boolean[data.vertex.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[start] = true;
		queue.offer(start);
		while(!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(" visisted " + node);
			for(int d : data.vertex[node]) {
				if(visited[d] != true) {
					visited[d] = true;
					queue.offer(d);
				}
			}
		}
	}
}
