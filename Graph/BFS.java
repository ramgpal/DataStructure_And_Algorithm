import java.util.*;
public class BFS {
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
   public static void bfs(ArrayList<Edge> [] graph) {
    Queue<Integer> q = new LinkedList<>(); // FIFO
    boolean visited [] = new boolean[graph.length]; // initially false
    q.add(0); // start -> 0  (BFS me start khi se kr sakte hain)
    while(!q.isEmpty()) {
        int curr = q.remove();
        if(!visited[curr]) {  // yadi visited[curr] par false hai matlab abhi tak queue me nhi aaya hai
            System.out.print(curr+" ");
            visited[curr] = true;
            // to add all neighbours of curr into the queue
            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
    } 
   }
   public static void main(String[] args) {
    int V = 5;
    ArrayList<Edge> [] graph = new ArrayList[V];
    createGraph(graph);
    bfs(graph);
   }
}
