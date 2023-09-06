import java.util.*;

public class CheapestFlightsWithinKSteps {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    public static class Info {
        int v; // vertex
        int cost;
        int s; // stops

        Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.s = s;
        }
    }

    public static int cheapestFlights(int n, int flights[][], int source, int destination, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);
        int distance[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != source) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(source, 0, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.s > k) {
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int v = e.dest;
                int w = e.wt;
                if (curr.cost + w < distance[v] && curr.s <= k) {
                    distance[v] = curr.cost + w;
                    q.add(new Info(v, distance[v], curr.s + 1));
                }
            }
        }
        if (distance[destination] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return distance[destination];
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int source = 0;
        int destination = 2; // Corrected destination index
        int k = 1;
        System.out.println(cheapestFlights(n, flights, source, destination, k));
    }
}

