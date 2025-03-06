
public class GraphMain {

    public static void main(String[] args) {
        GraphUsingEdgeList g = new GraphUsingEdgeList(4);
        g.addEdge(0, 1, 1);
        g.addEdge(0, 2, 2);
        g.addEdge(2, 3, 3);
        g.addEdge(1, 2, 4);
        g.addEdge(3, 1, 5);

        System.out.println(g);
        g.printGraph();
    }
}
