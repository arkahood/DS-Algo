package algorithm.dynamicProgramming;

public class minSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,6,11,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        boolean[][] mat = subsetSum(arr,sum);
        int s1=0;
        // we cheak the last row
        for(int j=0;j<=sum/2;j++){
            if(mat[arr.length][j]==true){
                s1 = j;
            }
        }
        System.out.println(sum-(2*s1));
    }
    static boolean[][] subsetSum(int[] arr,int sum){
        boolean[][] mat = new boolean[arr.length+1][sum+1];
        for(int i = 0; i < mat.length; i++){
            mat[i][0] = true;
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(j >= arr[i-1]){
                    mat[i][j] = (mat[i-1][j] || mat[i-1][j-arr[i-1]]);
                }
                else{
                    mat[i][j] = mat[i-1][j];
                }
            }
        }
        return mat;
    }
}
