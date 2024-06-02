import java.util.*;
import java.util.LinkedList;
public class BiPartite {
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
       graph[0].add(new Edge(0, 2));
       // vertex -> 1
       graph[1].add(new Edge(1, 0));
       graph[1].add(new Edge(1, 3));
       // vertex -> 2
       graph[2].add(new Edge(2, 3));
       graph[2].add(new Edge(2, 0));
       // vertex -> 3
       graph[3].add(new Edge(3,1));
       graph[3].add(new Edge(3, 2));
   }
// Bi-partite 
   // TC - O(V+E)
   public static boolean isBipartite(ArrayList<Edge>[] graph) {
    int color[] = new int[graph.length];
    for(int i = 0; i < color.length; i++) {
        color[i] = -1; // No color
    }

    Queue<Integer> q =  new LinkedList<>();
    for(int i = 0; i < graph.length; i++) {
        if(color[i] == -1) {
            q.add(i);
           color[i] = 0; // yellow
           while(!q.isEmpty()) {
            int curr = q.remove();
             for(int j = 0; j < graph[curr].size(); j++) {
                Edge e = graph[curr].get(j);
                // case1 -> neighbour has no color
                if(color[e.dest] == -1) {
                    int nextColor = color[curr] == 0 ? 1:0; // color 1(red) hai to 0(yellow) & vicevarsa
                    color[e.dest] = nextColor; 
                    q.add(e.dest);
                }
                // neigbour or current vertex ka color same hai to bipartitr nhi hoga
                else if(color[e.dest] == color[curr]) {
                    return false;
                }
           }
           }  
    }
   }
   return true;
}
 
   public static void main(String[] args) {
    int V = 4;
    ArrayList<Edge> [] graph = new ArrayList[V];
    createGraph(graph);
    System.out.println(isBipartite(graph));
   }
}
