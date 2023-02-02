public class GridWays {
    public static int CountTotalWays(int i,int j,int row,int col) {
        //base case
        if(i==row-1 && j==col-1) { //condition for last cell
            return 1;
        }
        else if(i==row || j==col) { //boundary cross condition
            return 0;
        }
      //For down
        int way1=CountTotalWays(i+1, j, row, col);
        //for right
        int way2=CountTotalWays(i, j+1, row, col);
        return way1+way2;
    }
    public static void main (String[] args) {
        int row=3,col=3;
        System.out.println(CountTotalWays(0,0,row,col));
    }
}
//Time complexity-O(2^(n+m))
