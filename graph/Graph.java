package graph;

class Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;
  
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }
  
    public void addEdge(int source, int destination) {
        // Add an edge between source and destination
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // Uncomment for undirected graph
    }
  
    public void removeEdge(int source, int destination) {
        // Remove the edge between source and destination
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0; // Uncomment for undirected graph
    }
  
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
