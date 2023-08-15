import java.util.*;
public class TopologicalSorting {
  public static class Edge {
    int src;
    int dest;
    Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
  }  
  public static void createGraph(ArrayList<Edge> []graph) {
    for(int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }
    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 1));

    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));

    graph[5].add(new Edge(5, 0)); 
    graph[5].add(new Edge(5, 2)); 
  }
// Modified DFS -> using a stack we can check dependencies
  public static void topologicalSorting(ArrayList<Edge> [] graph) {
    boolean visited[] = new boolean[graph.length];
    Stack<Integer> s = new Stack<>();
    for(int i = 0; i < graph.length; i++) {
        if(!visited[i]) {
            topologicalSortingUtil(graph, i, visited, s); // Modifies dfs functi0n
        }
    }
    while(!s.isEmpty()) {
      System.out.print(s.pop()+" ");
    }
  }
  public static void topologicalSortingUtil(ArrayList<Edge> [] graph, int curr,  boolean visited[], Stack<Integer> s) {
      visited[curr] = true;
      for(int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if(!visited[e.dest]) {
          topologicalSortingUtil(graph, e.dest, visited, s);
        }
      }
      s.push(curr);
  }
  public static void main(String[] args) {
    int V = 6;
    ArrayList<Edge> [] graph = new ArrayList[V];
    createGraph(graph);
    topologicalSorting(graph);
  }
}
