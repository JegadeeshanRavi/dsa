package graph;

public class GraphWith2DArray {
	public int[][] vertex;

	public GraphWith2DArray(int nodes) {
		this.vertex = new int[nodes][nodes];
	}

	public void createEdge(int node1, int node2) {
		this.vertex[node1][node2] = 1;
		this.vertex[node2][node1] = 1;
	}

	public static void main(String[] args) {
		GraphWith2DArray graph = new GraphWith2DArray(4);
		graph.createEdge(0, 1);
		graph.createEdge(1, 2);
		graph.createEdge(2, 3);
		graph.createEdge(3, 0);

		for (int i = 0; i < graph.vertex.length; i++) {
			for (int j = 0; j < graph.vertex[i].length; j++) {
				System.out.print(graph.vertex[i][j] + " ");
			}
			System.out.println();
		}

	}
}
