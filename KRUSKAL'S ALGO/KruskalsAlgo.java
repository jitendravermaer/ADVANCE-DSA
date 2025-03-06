import java.util.*;

public class KruskalsAlgo {
    static int kruskal(int V, int E, ArrayList<ArrayList<Integer>> graph) {
        int res = 0;
        int parent[] = new int[V];
        int rank[] = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        Collections.sort(graph, (a, b) -> a.get(2) - b.get(2));
        for (int i = 0; i < E; i++) {
            int u = graph.get(i).get(0);
            int v = graph.get(i).get(1);
            int w = graph.get(i).get(2);
            int x = find(u, parent);
            int y = find(v, parent);
            if (x != y) {
                res += w;
                union(x, y, parent, rank);
            }
        }
        return res;
    }

    static int find(int u, int parent[]) {
        if (u != parent[u]) {
            parent[u] = find(parent[u], parent);
        }
        return parent[u];
    }

    static void union(int u, int v, int parent[], int rank[]) {
        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[v] < rank[u]) {
            parent[v] = u;
        } else {
            parent[u] = v;
            rank[v]++;
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 10)));
        graph.add(new ArrayList<>(Arrays.asList(0, 2, 6)));
        graph.add(new ArrayList<>(Arrays.asList(0, 3, 5)));
        graph.add(new ArrayList<>(Arrays.asList(1, 3, 15)));
        graph.add(new ArrayList<>(Arrays.asList(2, 3, 4)));

        System.out.println("Minimum cost: " + kruskal(V, E, graph));
    }
}
