import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
}

public class CloneGraph {
    static Node clone(Node source) {
        LinkedList<Node> q = new LinkedList<>();
        q.add(source);
        HashMap<Node, Node> map = new HashMap<>();
        map.put(source, new Node(source.val));
        while(!q.isEmpty()) {
            // this is source node
            Node u = q.poll();
            // this is copy of source node
            Node cloneNodeU = map.get(u);
            if(u.neighbors != null) {
                List<Node> v = u.neighbors;
                for(Node graphNode : v) {
                    Node cloneNodeV = map.get(graphNode);
                    // check if node is already created
                    if(cloneNodeV == null) {
                        q.add(graphNode);
                        cloneNodeV = new Node(graphNode.val);
                        map.put(graphNode, cloneNodeV);
                    }
                    cloneNodeU.neighbors.add(cloneNodeV);
                }
            }
        }
        return map.get(source);
    }
}
