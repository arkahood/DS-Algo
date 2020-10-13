package algorithm.dynamicProgramming;

public class subsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 30;
        boolean res = isSubset(arr,sum);
        System.out.println(res);
    }

    static boolean isSubset(int[] arr,int sum){
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
        return mat[arr.length][sum];
    }
}
