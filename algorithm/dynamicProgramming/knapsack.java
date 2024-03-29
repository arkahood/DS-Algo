package algorithm.dynamicProgramming;

/*
Given weights and values of n items, put these items in a knapsack of capacity W 
to get the maximum total value in the knapsack. In other words, given two integer 
arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with
n items respectively. Also given an integer W which represents knapsack capacity, 
find out the maximum value subset of val[] such that sum of the weights of this subset
is smaller than or equal to W. You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
*/
public class knapsack {
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int w = 50; 

        System.out.println(KnapSack(val,wt,w));

        System.out.println(recKnapSack(val,wt,w,val.length));
    }
    static int KnapSack(int[] val,int[] wt,int w){
        int n = wt.length;
        int[][] arr = new int[n+1][w+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j){
                    arr[i][j] = Math.max(arr[i-1][j], val[i-1] + arr[i-1][j-wt[i-1]]);
                }
                else{
                    arr[i][j] = arr[i][j-1];
                }
            }
        }

        return arr[n][w];
    }

    // using recurssion

    static int recKnapSack(int[] val,int[] wt,int w,int n){
        if(n == 0 || w == 0){
            return 0;
        }
        else if(wt[n-1] > w){
            return recKnapSack(val, wt, w, n-1);
        }
        else{
            return Math.max(val[n-1] + recKnapSack(val, wt, w-wt[n-1], n-1), recKnapSack(val, wt, w, n-1) );
        }
    }
}
