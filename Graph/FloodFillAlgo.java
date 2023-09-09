import java.util.*;
public class FloodFillAlgo {
    public static void helper(int images[][], int sr, int sc, int color, boolean visited[][], int OrgCol) {
        if(sr < 0 || sc < 0 || sr >= images.length || sc >= images[0].length || images[sr][sc] != OrgCol || visited[sr][sc]) {
            return;
        }
        //left
        helper(images, sr, sc-1, color, visited, OrgCol);
        // right
        helper(images, sr, sc+1, color, visited, OrgCol);
        // up
        helper(images, sr-1, sc, color, visited, OrgCol);
        // down
        helper(images, sr+1, sc, color, visited, OrgCol);
    }
    public static int[][] floodFill(int images[][], int sr, int sc, int color) {
        boolean visited[][] = new boolean[images.length][images[0].length];
        // helper function
        helper(images, sr, sc, color, visited, images[sr][sc]);
        return images;
    }
    public static void main(String[] args) {
        int images[][] = {{1, 1, 1},
                          {1, 1, 0},
                          {1, 0, 1}};
        int sr = 1; // starting row
        int sc = 2; // starting column
        int Color = 2; // color to fill
        System.out.println(floodFill(images, sr, sc, Color));
    }
}
