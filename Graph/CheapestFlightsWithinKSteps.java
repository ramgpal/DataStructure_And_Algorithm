import java.util.*;
public class CheapestFlightsWithinKSteps {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
public static void  createGraph(ArrayList<Edge> [] graph) {
    for(int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1, 100));
    graph[0].add(new Edge(0, 2, 500));

    graph[1].add(new Edge(1, 2, 100));
}

public static void main(String[] args) {
    int V = 3;
    ArrayList<Edge> [] graph = new ArrayList[V];
    createGraph(graph);
}
}
