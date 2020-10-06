package algorithm;

//Time complexity : O(log(n))

public class fibonacci{
    public static void main(String[] args) {
        int n = 13;
        System.out.println(fib(n));
    }
    static int fib(int n){
        int f0 = 0;
        int f1 = 1;
        if(n==0) return 0;
        if(n==1) return 1;
        int[][] mat ={{0,1},{1,1}};
        mat = pmatrix(mat, n-1);
        int fn = (f0*mat[0][1])+(f1*mat[1][1]);
        return fn;

    }
    static int[][] pmatrix(int[][] mat,int n){
        int[][] iden = {{1,0},{0,1}};
        while(n>=1){
            if(n%2==0){
                mat = multiplyMat(mat,mat);
                n/=2;
            }
            else{
                iden = multiplyMat(mat,iden);
                n--;
            }
        }
        return iden;
    }
    static int[][] multiplyMat(int[][] a,int[][] b){
        int n = a.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    res[i][j] = res[i][j] + (a[k][j]*b[i][k]);
                }
            }
        }
        return res;
    }
}