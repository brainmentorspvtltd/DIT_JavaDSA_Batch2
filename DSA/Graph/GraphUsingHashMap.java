import java.util.HashMap;

class Vertex {
    HashMap<String, Integer> neighbours = new HashMap<>();
}

class GraphOperations {
    HashMap<String, Vertex> vertices = new HashMap<>();

    void addVertex(String vertexName) {
        Vertex vertex = new Vertex();
        vertices.put(vertexName, vertex);
    }

    boolean isEdgeExist(String firstVertex, String secondVertex) {
        Vertex first = vertices.get(firstVertex);
        Vertex second = vertices.get(secondVertex);

        if(first == null || second == null || !first.neighbours.containsKey(secondVertex)) {
            return false;
        }
        return true;

    }

    void addEdge(String firstVertex, String secondVertex, int weight) {
        if(isEdgeExist(firstVertex, secondVertex)) {
            System.out.println("Edge already present...");
            return;
        }
        Vertex first = vertices.get(firstVertex);
        Vertex second = vertices.get(secondVertex);
        first.neighbours.put(secondVertex, weight);
        second.neighbours.put(firstVertex, weight);
    }

}

public class GraphUsingHashMap {
    public static void main(String[] args) {
        GraphOperations graph = new GraphOperations();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "C", 20);
        graph.addEdge("C", "D", 6);
        graph.addEdge("A", "D", 9);

    }
}
