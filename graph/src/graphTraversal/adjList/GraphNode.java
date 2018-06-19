package graphTraversal.adjList;

public class GraphNode {
	int vertex;
	GraphNode link;
	
	public GraphNode() {
		this.link = null;
	}
	
	public GraphNode(int vertex) {
		this();
		this.vertex = vertex;
	}

}
