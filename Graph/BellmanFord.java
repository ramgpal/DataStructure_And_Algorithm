import java.util.*;
public class BellmanFord {
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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        // 1 -> vertex
        graph[1].add(new Edge(1, 2, -4));
        // 2 -> vertex
        graph[2].add(new Edge(2, 3, 2));
        // 3 -> vertex
        graph[3].add(new Edge(3, 4, 4));
        // 4 -> vertex
        graph[4].add(new Edge(4, 1, -1));
    }
    // TC -> O(VE)
    public static void bellmanFord(ArrayList<Edge> [] graph, int source) {
        int distance[] = new int[graph.length];
        for(int i = 0; i < distance.length; i++) {
            if( i != source) {
               distance[i] = Integer.MAX_VALUE;
            }
        }
        int v = graph.length;
        // algo
        for(int i = 0; i < v-1; i++) {
            // edges
            for(int j = 0; j < graph.length; j++) {
                for(int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    // U, V & W
                    int U = e.src;
                    int V = e.dest;
                    int W = e.wt;
                    // relaxation
                    if(distance[U] != Integer.MAX_VALUE && distance[U] + W < distance[V]) {
                        distance[V] = distance[U] + W;
                    }
                }
            }
        } 
        for(int i = 0; i < distance.length; i++) {
            System.out.print(distance[i]+" ");
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}
