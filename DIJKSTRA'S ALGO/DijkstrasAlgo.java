
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstrasAlgo {

    static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s) {
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<ArrayList<Integer>>(
                new Comparator<ArrayList<Integer>>() {
                    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                        return a.get(1) - b.get(1);
                    }
                });
        pq.add(new ArrayList<Integer>(Arrays.asList(s, 0)));
        while (!pq.isEmpty()) {
            int node = pq.poll().get(0);
            for (ArrayList<Integer> it : adj.get(node)) {
                if (dist[node] + it.get(1) < dist[it.get(0)]) {
                    dist[it.get(0)] = dist[node] + it.get(1);
                    pq.add(new ArrayList<Integer>(Arrays.asList(it.get(0), dist[it.get(0)])));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(7, 8)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(2, 8)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(7, 11)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(1, 8)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(3, 7)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(5, 4)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(8, 2)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(2, 7)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(4, 9)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(5, 14)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(3, 9)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(5, 10)));
        adj.get(5).add(new ArrayList<>(Arrays.asList(2, 4)));
        adj.get(5).add(new ArrayList<>(Arrays.asList(3, 14)));
        adj.get(5).add(new ArrayList<>(Arrays.asList(4, 10)));
        adj.get(5).add(new ArrayList<>(Arrays.asList(6, 2)));
        adj.get(6).add(new ArrayList<>(Arrays.asList(5, 2)));
        adj.get(6).add(new ArrayList<>(Arrays.asList(7, 1)));
        adj.get(6).add(new ArrayList<>(Arrays.asList(8, 6)));
        adj.get(7).add(new ArrayList<>(Arrays.asList(0, 8)));
        adj.get(7).add(new ArrayList<>(Arrays.asList(1, 11)));
        adj.get(7).add(new ArrayList<>(Arrays.asList(6, 1)));
        adj.get(7).add(new ArrayList<>(Arrays.asList(8, 7)));
        adj.get(8).add(new ArrayList<>(Arrays.asList(2, 2)));
        adj.get(8).add(new ArrayList<>(Arrays.asList(6, 6)));
        adj.get(8).add(new ArrayList<>(Arrays.asList(7, 7)));
        int[] res = dijkstra(9, adj, 0);
        System.out.println("Shortest distances from source 0:");
        System.out.println("Vertex \t Distance from Source");

        for (int i = 0; i < res.length; i++) {
            System.out.print(i + "\t\t" + res[i]);
            System.out.println();
        }
    }
}