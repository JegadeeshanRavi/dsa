package graph;

import java.util.Stack;

public class GraphDFS {
	
	public static void main(String[] args) {
		GraphWithLinkedList graph = new GraphWithLinkedList(5);
		GraphWithLinkedList data = graph.getGraph();
		dfsTraversal(0, data);
	}

	public static void dfsTraversal(int start, GraphWithLinkedList data) {
		boolean[] visited = new boolean[data.vertex.length];
		Stack<Integer> stack = new Stack<Integer>();
		visited[start] = true;
		stack.push(start);
		while(!stack.isEmpty()) {
			int node = stack.pop();
			System.out.print(" visisted " + node);
			for(int d : data.vertex[node]) {
				if(visited[d] != true) {
					visited[d] = true;
					stack.push(d);
				}
			}
		}
	}

}
