import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int V;
    private List<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public int[] shortestDistances(int source) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = -1;
        }
        dist[source] = 0;
        boolean[] visited = new boolean[V];
        visited[source] = true;
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            int u = queue.remove(0);
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    dist[v] = dist[u] + 1;
                    queue.add(v);
                }
            }
        }
        return dist;
    }

    public void addTemporaryEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public void removeTemporaryEdge(int u, int v) {
        adj[u].remove(Integer.valueOf(v));
        adj[v].remove(Integer.valueOf(u));
    }

    public boolean areConnected(int u, int v) {
        return adj[u].contains(v);
    }
}
