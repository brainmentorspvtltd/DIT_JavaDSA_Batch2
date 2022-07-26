import java.util.Arrays;

public class DijkstraAlgorithm {

    static int[] disjkstra(int graph[][], int V, int source) {
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        boolean set[] = new boolean[V];
        for(int i = 0; i < V; i++) {
            int u = -1;
            for(int j = 0; j < V; j++) {
                if(!set[j] && (u == -1 || distance[j] < distance[u])) {
                    u = j;
                }
            }
            set[u] = true;
            for(int v = 0; v < V; v++) {
                if(graph[u][v] != 0 && set[v] == false) {
                    distance[v] = Math.min(distance[v], graph[u][v] + distance[u]);
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int V = 9;
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        int source = 0;
        int result[] = disjkstra(graph, V, source);
        for(int i : result) {
            System.out.print(i + ",");
        }
    }
}
