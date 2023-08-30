import java.util.*;
public class Dijkstra {
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
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        // 1 -> vertex
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        // 2 -> vertex
        graph[2].add(new Edge(2, 4, 3));
        // 3 -> vertex
        graph[3].add(new Edge(3, 5, 1));
        // 4 -> vertex
        graph[4].add(new Edge(4, 5, 5));
        graph[4].add(new Edge(4, 3, 2));
    }
    public static class Pair implements Comparable<Pair> {
        int n;
        int path;
        Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path based sorting for my pairs
        }
    }
    
    public static void Dijkstra_Algo(ArrayList<Edge>[] graph, int source) {
        int distance[] = new int [graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(i != source) {
                distance[i] = Integer.MAX_VALUE; // +infinity
            }
        }
            boolean visited[] = new boolean[graph.length];
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(source, 0));
            while(!pq.isEmpty()) {
                Pair curr = pq.remove();
                if(!visited[curr.n]) {
                    visited[curr.n] = true;
                    // neighbours
                    for(int i = 0; i < graph[curr.n].size(); i++) {
                        Edge e = graph[curr.n].get(i);
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.wt;
                        if(distance[u] + wt < distance[v]) {
                            distance[v] = distance[u]+wt; // updating the distance from src to dest
                        pq.add(new Pair(v, distance[v]));
                       }
                    }
                }
            }
        // printing the all source to vertices shortest distance
        for(int i = 0; i < distance.length; i++) {
            System.out.print(distance[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        int source = 0;
        Dijkstra_Algo(graph, source);
    }
}
