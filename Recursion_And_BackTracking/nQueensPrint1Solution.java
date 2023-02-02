public class nQueensPrint1Solution {
    //To check attacking or not
    public static boolean IsSafe(char board[][],int row,int col) {
 //Verticle up
 for(int i=row-1;i>=0;i--) {
   if(board[i][col]=='Q') {
        return false;
    }
 }
 //left diagonal up
 for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)  {
    if(board[i][j]=='Q') {
        return false;
    }
}
 //right diagonal up
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
        if(board[i][j]=='Q') {
            return false;
        }
        }
        return true; 
    }
    public static boolean nQueens(char board[][],int row) {
        //base
        if(row==board.length) {
          count++;
            return true;
        }
        //col loop
        for(int j=0;j<board.length;j++) {
            if(IsSafe(board,row,j)) {
                board[row][j]='Q';
                if(nQueens(board,row+1)) {
                    return true; 
                }
                board[row][j]='.';
        }
    }
    return false;
    }
    //To print
    public static void PrintBoard(char board[][]) {
        System.out.println("---- ChessBoard -----");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
    }
    System.out.println();
} }
static int count=0; 
//Function call
    public static void main (String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]='.';
    }
}
nQueens(board,0);
if(nQueens(board,0)) {
    PrintBoard(board);
}
else {
    System.out.println("Solution is not possible");
}
    }
}


