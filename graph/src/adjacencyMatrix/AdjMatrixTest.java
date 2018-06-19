package adjacencyMatrix;

public class AdjMatrixTest {

	public static void main(String[] args) {
		AdjMatrix MG = new AdjMatrix();
		for(int i=0; i<4; i++)
			MG.insertVertex(i);
		
		MG.insertEdge(0, 3);
		MG.insertEdge(0, 1);
		MG.insertEdge(1, 3);
		MG.insertEdge(1, 2);
		MG.insertEdge(1, 0);
		MG.insertEdge(2, 3);
		MG.insertEdge(2, 1);
		MG.insertEdge(3, 2);
		MG.insertEdge(3, 1);
		MG.insertEdge(3, 0);
		System.out.print("그래프 MG의 인접행렬: ");
		MG.printMatrix();
	}
}
