import java.util.*;
public class CycleDetectionDirected {
    public static class Edge{
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // vertex -> 0
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));
        // vertex -> 1
        graph[1].add(new Edge(1, 3));
        // vertex -> 2
        graph[2].add(new Edge(2, 3));
    }
    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                if(isCycleUtil(graph, visited, i, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge> [] graph,boolean visited[], int curr, boolean[] stack) {
        visited[curr] = true;
        stack[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) { // neighbour are already in stack or not
                return true;
            }
           if(!visited[e.dest]) {
               if(isCycleUtil(graph, visited, e.dest, stack)) {
                return true;
               }
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int v = 4; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.print(isCycle(graph));
    }
}
