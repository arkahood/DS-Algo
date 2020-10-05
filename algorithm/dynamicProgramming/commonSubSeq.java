package algorithm.dynamicProgramming;

public class commonSubSeq {
    public static void main(String[] args) {
        String s = "AGGTAB";
        String s1 = "GXTXAYB";
        System.out.println(commonSeq(s,s1));
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
    static int max(int a,int b){
        return (a>b)?a:b;
    }
}
