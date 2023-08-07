import java.util.*;
public class HasPath {
    static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph) {
        for(int i = 0; i < graph.length; i++) {
           graph[i] = new ArrayList<>();
        }
        // vertex -> 0
        graph[0].add(new Edge(0, 1, 1));
        // vertex -> 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        // vertex -> 2
        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 1, 1));
        // vertex -> 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
        // vertex -> 4
        graph[4].add(new Edge(4, 2, 1));
        // to print neighbours of 2
   }
   public static boolean hasPath(ArrayList<Edge> [] graph, int source, int destination, boolean visited[]) {
    if(source == destination) {
        return true;
    }
    visited[source] = true;
    for(int i = 0; i< graph[source].size(); i++) {
        Edge e = graph[source].get(i);
        // e.dest is my padosi
        if(!visited[e.dest] && hasPath(graph, e.dest, destination, visited)) {
            return true;
        }
    }
    return false;
   }
   public static void main(String[] args) {
    int V = 5;
    ArrayList<Edge> [] graph = new ArrayList[V];
    createGraph(graph);
    System.out.println(hasPath(graph, 0, 4, new boolean[V]));
   }
}

