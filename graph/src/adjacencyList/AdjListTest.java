package adjacencyList;

public class AdjListTest {

	public static void main(String[] args) {
		AdjList LG = new AdjList();
		
		for(int i=0; i<4; i++) {
			LG.insertVertex(i);
		}
		
		LG.insertEdge(0, 3);
		LG.insertEdge(0, 1);
		LG.insertEdge(1, 3);
		LG.insertEdge(1, 2);
		LG.insertEdge(1, 0);
		LG.insertEdge(2, 3);
		LG.insertEdge(2, 1);
		LG.insertEdge(3, 2);
		LG.insertEdge(3, 1);
		LG.insertEdge(3, 0);
		System.out.print("그래프 LG의 인접리스트: ");
		LG.printAdjList();

	}

}
