import java.util.*;
public class createAGraph {
    public static class Edge{
        int source;
        int destination;
        int weight;
    public Edge(int s, int d, int w) {
        this.source = s;
        this.destination = d;
        this. weight = w;
    }
} 
  public static void main(String[] args) {
    int V = 5; // number of vertices
    // int arr[] = new int[V]
    ArrayList<Edge> [] graph = new ArrayList[V]; //array of arraylist 
    for(int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }
    // o vertex
    graph[0].add(new Edge(0, 1, 5));
    // 1 vertex
     graph[1].add(new Edge(1, 0, 5));
     graph[1].add(new Edge(1, 2, 1));
     graph[1].add(new Edge(1, 3, 3));
    //2 vertex
     graph[2].add(new Edge(2, 1, 1));
     graph[2].add(new Edge(2, 3, 1));
     graph[2].add(new Edge(2, 4, 2));

     // 3 vertex
     graph[3].add(new Edge(3, 1, 3));
     graph[3].add(new Edge(3, 2, 1));
     // 4 vertex
     graph[4].add(new Edge(4, 2, 2));
     

// 2's neighbours
    for(int i = 0; i < graph[2].size();i++) {
        Edge e = graph[2].get(i);
        System.out.println(e.destination);
    }
  }
}
