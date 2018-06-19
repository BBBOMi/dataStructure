package graphTraversal.adjList;

import graphTraversal.queueBFS.LinkedQueue;
import graphTraversal.stackDFS.LinkedStack;

public class AdjList {
	private GraphNode[] head = new GraphNode[10];
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	}
	
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("삽입 실패. 그래프에 없는 정점입니다.");
		} else {
			GraphNode gNode = new GraphNode(v2);
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}
	
	public void printAdjList() {
		GraphNode temp = new GraphNode();
		for(int i=0; i<totalV; i++) {
			System.out.printf("%n 정점 %c의 인접리스트", i+65);
			temp = head[i];
			while(temp != null) {
				System.out.printf(" -> %c", temp.vertex+65);
				temp = temp.link;
			}
		}
	}
	
	public void DFS(int v) {
		GraphNode w = new GraphNode();
		LinkedStack s = new LinkedStack();
		boolean[] visited = new boolean[totalV];
		
		s.push(v);
		visited[v] = true;
		System.out.printf("  %c", v+65);
		while(s.top != null) {
			w = head[v];
			while(w != null) {
				if(!visited[w.vertex]) {
					s.push(w.vertex);
					visited[w.vertex] = true;
					System.out.printf("  %c", w.vertex+65);
					v = w.vertex;
					w = head[v];
				} else
					w = w.link;
			}
			v = s.pop();
		}	
	}
	
	public void BFS(int v) {
		GraphNode w = new GraphNode();
		LinkedQueue q = new LinkedQueue();
		boolean[] visited = new boolean[totalV];
		
		visited[v] = true;
		System.out.printf("  %c", v+65);
		q.enQueue(v);
		while(!q.isEmpty()) {
			v = q.deQueue();
			for(w = head[v]; w != null; w = w.link) {
				if(!visited[w.vertex]) {
					visited[w.vertex] = true;
					System.out.printf("  %c", w.vertex+65);
					q.enQueue(w.vertex);
				}
			}
		}
	}
	
}
