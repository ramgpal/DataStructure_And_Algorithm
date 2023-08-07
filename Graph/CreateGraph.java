import java.util.*;
public class CreateGraph {
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
    public static void main(String[] args) {
         int V = 5; // number of vertices present in graph
         ArrayList<Edge> [] graph = new ArrayList[V];
         for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
         }
         // vertex -> 0
         graph[0].add(new Edge(0, 1, 5));
         // vertex -> 1
         graph[1].add(new Edge(1, 0, 5));
         graph[1].add(new Edge(1, 2, 1));
         graph[1].add(new Edge(1, 3, 3));
         // vertex -> 2
         graph[2].add(new Edge(2, 4, 2));
         graph[2].add(new Edge(2, 3, 1));
         graph[2].add(new Edge(2, 1, 1));
         // vertex -> 3
         graph[3].add(new Edge(3, 1, 3));
         graph[3].add(new Edge(3, 2, 1));
         // vertex -> 4
         graph[4].add(new Edge(4, 2, 2));
         // to print neighbours of 2
         for(int i = 0; i< graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
         }
    }
}
