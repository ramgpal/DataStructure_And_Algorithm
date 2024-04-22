import java.util.*;
public class createGraph {
    public static void main(String[] args) {
        int graph[][] = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 4}, {4, 5}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        // Initialize the adjacency list
        for (int i = 0; i < graph.length + 1; i++) {
            adj.add(new ArrayList<>());
        }

        // Construct the adjacency list
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.println(graph[i][j]);
                adj.get(graph[i][j]).add(i + 1);
                System.out.println(i+1);
            }
        }

        // Print the adjacency list
        for (int i = 1; i < adj.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
