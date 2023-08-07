import java.util.ArrayList;

public class DFS {
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
   public static void dfs(ArrayList<Edge> [] graph, int curr, boolean visited[]) {
    // visit
    System.out.print(curr+" ");
    visited[curr] = true;
    for(int i = 0; i < graph[curr].size(); i++ ) { 
        Edge e = graph[curr].get(i);
        if(!visited[e.dest]) {
            dfs(graph, e.dest, visited);
        }
    }
   }
   public static void main(String[] args) {
    int V = 5;
    ArrayList<Edge> [] graph = new ArrayList[V];
    createGraph(graph);
    dfs(graph, 0, new boolean[V]);
   }
}
