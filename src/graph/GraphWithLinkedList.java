package graph;

import java.util.LinkedList;

public class GraphWithLinkedList {
	public LinkedList<Integer>[] vertex;

	public GraphWithLinkedList(int nodes) {
		vertex = new LinkedList[nodes];
		for (int i = 0; i < nodes; i++) {
			vertex[i] = new LinkedList<Integer>();
		}
	}

	public void createEdge(int node1, int node2) {
		this.vertex[node1].add(node2);
		this.vertex[node2].add(node1);
		
	}
	
	public GraphWithLinkedList getGraph() {
		GraphWithLinkedList graph = new GraphWithLinkedList(4);
		graph.createEdge(0, 1);
		graph.createEdge(1, 2);
		graph.createEdge(2, 3);
		graph.createEdge(3, 0);
		return graph;
	}

	public static void main(String[] args) {
		GraphWithLinkedList graph = new GraphWithLinkedList(4);
		graph.createEdge(0, 1);
		graph.createEdge(1, 2);
		graph.createEdge(2, 3);
		graph.createEdge(3, 0);

		for (int i = 0; i < graph.vertex.length; i++) {
			 for (int j = 0; j < graph.vertex[i].size(); j++) {
				System.out.println(i + "---> " + graph.vertex[i].get(j));
			}
		}

	}
}
