package algorithm.recursion_Backtracking;

/*The problem is to count all the possible paths from top left 
to bottom right of a mXn matrix with the constraints that from 
each cell you can either move only to right or down*/


public class matrixMN {
    public static void main(String[] args) {
        int m = 3;
        int n= 3;
        int[][] mat = new int[m][n];
        System.out.println(numberOfWays(mat,m-1, n-1));
    }

    static int numberOfWays(int[][] mat,int m,int n){
        if(m==0 || n==0){
            return 1;
        }
        return numberOfWays(mat, m-1, n)+numberOfWays(mat, m, n-1);
    }
}
