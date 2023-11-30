public class spiralMatrix {
    public static void printSpiral(int arr[][]) {

        int n = arr.length; // rows
        int m = arr[0].length; // cols

        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = m-1;
        while(startRow <= endRow && startCol <= endCol) {

            //top
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j]+" ");
            }

            //right
            for(int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int j = endCol-1; j >= startCol; j-- ) {
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

        System.out.println(); 
    } 
    
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        printSpiral(arr);
    }
}
