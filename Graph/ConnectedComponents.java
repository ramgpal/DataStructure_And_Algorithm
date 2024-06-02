import java.util.*;
import java.util.LinkedList;
public class ConnectedComponents {
    public static class Edge {
        int src;
        int dest;
        int weight;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
            // Create edges for the 1st component
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
        
            graph[1].add(new Edge(1, 0, 1));
        
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 3, 1));
        
            graph[3].add(new Edge(3, 2, 1));
        
            // Create edges for the 2nd component
            graph[4].add(new Edge(4, 5, 1));
        
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));
        
            graph[6].add(new Edge(6, 5, 1));
    }

// For BFS
public static void BFS(ArrayList<Edge> [] graph) {
    boolean visited[] = new boolean[graph.length];
    for(int  i = 0; i < graph.length; i++) {
        if(!visited[i]) {
            BFSUtil(graph, visited);
        }
    }
}
   public static void BFSUtil(ArrayList<Edge> [] graph, boolean visited[]) {
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    while(!q.isEmpty()) {
        int curr = q.remove();
        if(!visited[curr]) {
            System.out.print(curr+" ");
            visited[curr] = true;
            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
        }
   }
// for DFS
    public static void DFS(ArrayList<Edge> [] graph) {
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                DFSUtil(graph, visited, i);
            }
        }
    }
    public static void DFSUtil(ArrayList<Edge> [] graph, boolean visited[], int curr) {
        // TC -> O(V+E)
        // Visit
        System.out.print(curr+" ");
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                DFSUtil(graph, visited, e.dest);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> [] graph = new ArrayList[V];
        for(int i = 0; i < V ; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        BFS(graph);
        DFS(graph);
      }
}
