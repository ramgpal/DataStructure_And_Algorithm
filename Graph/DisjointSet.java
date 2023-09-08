import java.util.*;
public class DisjointSet {
    static int n = 7;
    static int parent[] = new int[n];
    static int rank[] = new int[n];
    public static void init() {
        for(int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }
    public static int find(int x) {
        if(x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
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
    public static void main(String[] args) {
        init();
        Union(1, 3);
        System.out.println(find(3));
        find(3);
        Union(2, 4);
        Union(3, 6);
        Union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        Union(1, 5);
    }
}
