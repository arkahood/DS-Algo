package algorithm.recursion_Backtracking;

public class ratInAMaze {
    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };
        int[][] sol = new int[4][4];

        boolean result = mazeSolver(mat, 0, 0, 4, sol);
        if(result){
            System.out.println("solution matrix : ");
            for (int[] is : sol) {
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
    // helper function to cheack whether the rat can be in this square
    static boolean isSafe(int[][]mat,int x,int y,int n){
        
        if(x<n && y<n && mat[x][y] == 1){
            return true;
        }
        return false;
    }
    // main function
    static boolean mazeSolver(int[][] mat, int x,int y,int n,int[][] sol){
        
        if(x==n-1 && y==n-1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(mat,x,y,n)){
            sol[x][y] = 1;
            if(mazeSolver(mat, x+1, y, n, sol)){
                return true;
            }
            if(mazeSolver(mat, x, y+1, n, sol)){
                return true;
            }
            
            sol[x][y] = 0;
            return false;
        }
        
        return false;
        
    }
}
