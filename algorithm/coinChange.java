package algorithm;

public class coinChange {
    public static void main(String[] args) {
        int arr[] = {1, 6, 20}; 
        int m = arr.length; 
        int n = 24; 
        //total no of permutation possible :
        System.out.println(coin(arr, n, m));
        //minimum number of coins required :
        System.out.println(minCoin(arr, n)); 
    }
    static int coin(int[] arr,int n,int m){
        int[] res = new int[n+1];
        res[0] = 1;
        for(int i=0;i<m;i++){
            for(int j=arr[i];j<=n;j++){
                res[j] = res[j]+res[j-arr[i]];
            }
        }
        return res[n];
    }
    static int minCoin(int[] arr,int n){
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<=n;i++){
            res[i] = Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    res[i]=1;
                }
                else if(i>arr[j]){
                    
                    int min = res[i-arr[j]]+1;
                    if(min<res[i] && min!=0) res[i]=min;
                }
                

            }
        }
        return res[n];
    } 
}
