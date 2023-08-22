import java.util.*;
public class PathsFromSrcToDest {
    public static class Edge{
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // vertex -> 0
        graph[0].add(new Edge(0, 3));
        // vertex -> 2
        graph[2].add(new Edge(2, 3));
        // vertex -> 3
        graph[3].add(new Edge(3, 1));
        // vertex -> 4
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        // vertex -> 5
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(4, 2));
    } 
    // TC - O(V^V)
    public static void printAllPaths(ArrayList<Edge>[] graph, int source, int destination, String ans) {
        if(source == destination) {
            System.out.println(ans + destination);
            return;
        }
        for(int i = 0; i < graph[source].size(); i++) {
            Edge e = graph[source].get(i);
            printAllPaths(graph, e.dest, destination, ans+source);
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        int src = 5;
        int dest = 1;
        printAllPaths(graph, src, dest, "");
    }
}
