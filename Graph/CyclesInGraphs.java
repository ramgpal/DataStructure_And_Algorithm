import java.util.*;
public class CyclesInGraphs {
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
    graph[0].add(new Edge(0, 1));
    // graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    // graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3,4));

    graph[4].add(new Edge(4, 3));
}
// TC -> O(V+E)
public static boolean cycleDetection(ArrayList<Edge> [] graph) {
    boolean [] visited = new boolean[graph.length];
    for(int i = 0; i < graph.length; i++) {
        if(!visited[i]) {
          if(cycleDetectionUtil(graph, visited, i, -1)) {
            return true;
            // cycle exists in one of the parts
          } 
        }
    }
    return false;
}
public static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
   visited[curr] = true;
   for(int i = 0; i<graph[curr].size(); i++) {
    Edge e = graph[curr].get(i);
    // Case3 -> 
    if(!visited[e.dest]) {
        if(cycleDetectionUtil(graph, visited, e.dest, curr)) {
        return true;
    }
  }
    // Case1 ->
    else if(visited[e.dest] && e.dest != parent) {
        return true;
    }
    // Case2 -> do nothing: continue
   }
   return false;
}
public static void main(String[] args) {
    /*   Graph
           0-----3
         /  |    | 
        /   |    |
       1    |    4
       \    |
        \   |
          2
     */
    int v = 5;
    ArrayList<Edge> [] graph = new ArrayList[v];
    for(int i = 0; i < v; i++) {
        graph[i] = new ArrayList<>();
    }
    createGraph(graph);
    System.out.print(cycleDetection(graph));
}
}
