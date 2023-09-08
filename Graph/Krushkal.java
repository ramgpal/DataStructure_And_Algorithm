import java.util.*;

public class Krushkal {
    public static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int cost;
        Edge(int s, int d, int c) {
            this.src = s;
            this.dest = d;
            this.cost = c;
        }
        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }
    public static void createGraph(ArrayList<Edge> edges) {
       edges.add(new Edge(0, 1, 10));
       edges.add(new Edge(0, 2, 15));
       edges.add(new Edge(0, 3, 30));
       edges.add(new Edge(1, 3, 40));
       edges.add(new Edge(2, 3, 50));
    }
    static int n = 4; // no of vertices
    static int parent[] = new int[n];
    static int rank[] = new int[n];
    public static void init() {
        for(int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }
    // constant TC
    public static int find(int x) {
        if(x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    // constant TC
    public static void Union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        
        if(rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]) {
            parent[parA] = parB;
        }
        else {
           parent[parB] = parA;
        }
    }
    // TC -> O(V + ElogE)
    public static void krushkalMST(ArrayList<Edge> edges, int v) {   
        init();
        Collections.sort(edges);
        int cost = 0;
        int count = 0;
        for (int i = 0; i < edges.size(); i++) { // Iterate through all edges
           Edge e = edges.get(i);
           int parA = find(e.src); // a -> src
           int parB = find(e.dest); // b -> dest
           if (parA != parB) {
                Union(e.src, e.dest);
                cost += e.cost;
                count++;
           }
        }
        System.out.println(cost);
    }
    
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
       krushkalMST(edges, v);
    }
}
