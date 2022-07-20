import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFSDisconnected {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], int source) {
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

    static void bfsDisconnected(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v+1];
        for(int i = 1; i < v+1; i++) {
            visited[i] = false;
        }
        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                bfs(adj, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        
    }
    
}
