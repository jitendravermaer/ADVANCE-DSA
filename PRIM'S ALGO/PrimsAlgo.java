import java.util.ArrayList;
import java.util.Arrays;

public class PrimsAlgo {

    static int spanningTree(int V, int E, ArrayList<ArrayList<Integer>> graph) {
        int key[] = new int[V];
        boolean mstSet[] = new boolean[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        int res = 0;
        for (int count = 0; count < V; count++) {
            int u = -1;
            for (int i = 0; i < V; i++) {
                if (!mstSet[i] && (u == -1 || key[i] < key[u])) {
                    u = i;
                }
            }
            mstSet[u] = true;
            res += key[u];
            for (int v = 0; v < V; v++) {
                if (graph.get(u).get(v) != 0 && !mstSet[v] && graph.get(u).get(v) < key[v]) {
                    key[v] = graph.get(u).get(v);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int V = 5;
        int E = 8;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
            for (int j = 0; j < V; j++) {
                graph.get(i).add(0);
            }
        }

        // Manually adding edges to the graph
        graph.get(0).set(1, 2);
        graph.get(1).set(0, 2);
        graph.get(1).set(2, 3);
        graph.get(2).set(1, 3);
        graph.get(0).set(3, 6);
        graph.get(3).set(0, 6);
        graph.get(1).set(3, 8);
        graph.get(3).set(1, 8);
        graph.get(1).set(4, 5);
        graph.get(4).set(1, 5);
        graph.get(2).set(4, 7);
        graph.get(4).set(2, 7);
        graph.get(3).set(4, 9);
        graph.get(4).set(3, 9);

        System.out.println("Minimum cost: " + spanningTree(V, E, graph));
    }
}
