import java.util.Arrays;

class Graph {
    // class used to represent graph edge
    class Edge implements Comparable<Edge> {
        int source, dest, wt;
    
        @Override
        public int compareTo(Edge compareEdge) {
            return this.wt - compareEdge.wt;
        }
    };

    // collection of all edges
    Edge edge[];
    // number of vertices & number of edges
    int v, e;
    Graph(int v, int e) {
        this.v = v;
        this.e = e;
        edge = new Edge[this.e];
        for(int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    };

    class Subset {
        int parent, rank;
    };

    // void kruskalAlgo(int v) {
    //     Edge result[] = new Edge[v];
    //     Arrays.sort(edge);
    // }

}

public class Kruskal {
    public static void main(String[] args) {
        int V = 5;
        int E = 7;
        Graph graph = new Graph(V, E);
        graph.edge[0].source = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].wt = 10;

        graph.edge[1].source = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].wt = 8;

        graph.edge[2].source = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].wt = 11;
        
    }
}
