
import java.util.Arrays;

public class GraphUsingAdjMatrix {

    int V;
    boolean adjMatrix[][];

    GraphUsingAdjMatrix(int V) {
        this.V = V;
        adjMatrix = new boolean[V][V];
    }

    //Undirected Graph
    void addEdge(int v, int w) {
        adjMatrix[v][w] = true;
        adjMatrix[w][v] = true;
    }

    @Override
    public String toString() {
        return "GraphUsingAdjMatrix{"
                + "V=" + V
                + ", adjMatrix=" + Arrays.deepToString(adjMatrix)
                + '}';
    }

    public static void main(String[] args) {
        GraphUsingAdjMatrix graph = new GraphUsingAdjMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 1);
        System.out.println(graph);
    }
}
