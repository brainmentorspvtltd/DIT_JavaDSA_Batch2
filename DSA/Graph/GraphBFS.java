import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int v) {
        // Initialize visited array and also put false on each index
        boolean visited[] = new boolean[v+1];
        for(int i = 1; i < v+1; i++) {
            visited[i] = false;
        }
        int source = 1;
        // Initialize a queue and push source in it
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while(queue.size() != 0) {
            // Pop front element of queue
            source = queue.poll();
            System.out.println(source + " ");
            // get number of adjacent vertices of current source
            int size = adj.get(source).size();
            for(int i = 0; i < size; i++) {
                // get adjacent node
                int adjNode = adj.get(source).get(i);
                // check if adj node is visited or not
                if(visited[adjNode] == false) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for(int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);

        bfs(adj, V);

    }
}
