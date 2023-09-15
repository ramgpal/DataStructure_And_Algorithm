import java.util.*;
public class PrimsAlgo {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        // 2 -> vertex
        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));
        // 3 -> vertex
        graph[3].add(new Edge(3, 2, 50));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
    }
    public static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;
        Pair(int v, int c) {
            this.vertex = v;
            this.cost = c;
        }
        @Override 
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // assending order
        }
    }
    public static void getMSTUsingPrims(ArrayList<Edge> [] graph) {
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int totalMinCost = 0;
        while(!pq.isEmpty()) {
          Pair curr = pq.remove();
          if(!visited[curr.vertex])  {
            visited[curr.vertex] = true;
            totalMinCost += curr.cost;
            for(int i = 0 ; i < graph[curr.vertex].size() ; i++) {
                Edge e = graph[curr.vertex].get(i);
                pq.add(new Pair(e.dest, e.wt));
            }
          }
        }
        System.out.println("Minimum cost of the MST is: "+ totalMinCost);
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);
        getMSTUsingPrims(graph);
    }
}