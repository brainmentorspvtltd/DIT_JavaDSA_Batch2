import java.util.ArrayList;

public class GraphDFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s);
        for(int item : adj.get(s)) {
            if(visited[item] == false) {
                dfs(adj, s, visited);
            }
        }
    }

    static void dfsCall(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v+1];
        for(int i = 1; i < v+1; i++) {
            visited[i] = false;
        }
        int source = 1;
        dfs(adj, source, visited);
    }

    public static void main(String[] args) {
        
    }
}
