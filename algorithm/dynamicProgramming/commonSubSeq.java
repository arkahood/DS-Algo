package algorithm.dynamicProgramming;

public class commonSubSeq {
    public static void main(String[] args) {
        String s = "AGGTAB";
        String s1 = "GXTXAYB";
        System.out.println(commonSeq(s,s1));
        System.out.println(reclcs(s,s1,s.length(),s1.length()));
    }
    static int commonSeq(String s,String s1){
        int n = s.length();
        int m = s1.length();
        int[][] arr = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                }
                else{
                    arr[i][j] = max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        return arr[n][m];
    }
    // using recurssion
    static int reclcs(String x, String y, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+reclcs(x, y, n-1, m-1);
        }
        else{
            return max(reclcs(x, y, n-1, m), reclcs(x, y, n, m-1));
        }
    }
    static int max(int a,int b){
        return (a>b)?a:b;
    }
}
