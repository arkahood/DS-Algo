package algorithm.recursion_Backtracking;

public class nQueen {
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = new int[n][n];
        boolean result = queen(mat, 0, n);
        if(result){
            System.out.println("solution matrix : ");
            for (int[] is : mat) {
                for (int is2 : is) {
                    System.out.print(is2+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("no solution");
        }
    }
    // cheak if the cell is safe to move or not
    static boolean isSafe(int[][] mat,int x,int y,int n){
        //check the column
        for (int i = 0; i < n; i++) {
            if(mat[i][y]==1){
                return false;
            }
        }
        //check the left diagonal
        int row = x;
        int col = y;
        while(row>=0 && col>=0){
            if(mat[row][col]==1){
                return false;
            }
            row--;
            col--;
        }
        //check the right diagonal
        row = x;
        col = y;
        while(row>=0 && col<n){
            if(mat[row][col]==1){
                return false;
            }
            row--;
            col++;
        }

        return true;
    }



    static boolean queen(int[][] mat,int x,int n){
        if(x == n){
            return true;
        }

        for(int col=0;col<n;col++){
            if(isSafe(mat, x, col, n)){

                mat[x][col] = 1;

                if(queen(mat, x+1, n)){
                    return true;
                }
                
                mat[x][col] = 0;
            }
        }
        return false;
    }
}
