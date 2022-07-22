import java.util.ArrayList;

public class DetectCycleInDirected {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recStack) {
        visited[s] = true;
        recStack[s] = true;
        
        for(int item : adj.get(s)) {
            if(visited[item] == false && dfs(adj, item, visited, recStack) == true) {
                return true;
            }
            else if(recStack[item]) {
                return true;
            }
        }
        recStack[s] = false;
        return false;
    }

    static boolean dfsCall(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v+1];
        for(int i = 1; i < v+1; i++) {
            visited[i] = false;
        }

        boolean recursionStack[] = new boolean[v+1];
        for(int i = 1; i < v+1; i++) {
            recursionStack[i] = false;
        }

        for(int i = 0; i < v; i++){
            if(visited[i] == false) {
                if(dfs(adj, i, visited, recursionStack)) {
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for(int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 2, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 3);

        System.out.println(dfsCall(adj, V));
    }
}