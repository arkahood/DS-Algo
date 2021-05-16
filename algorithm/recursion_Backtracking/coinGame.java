package algorithm.recursion_Backtracking;


// Consider a row of n coins of values v1 . . . vn, where n is even. We play a game against an opponent by 
// alternating turns. In each turn, a player selects either the first or last coin from the row, removes it 
// from the row permanently, and receives the value of the coin. Determine the maximum possible amount of 
// money we can definitely win if we move first.
// Note: The opponent is as clever as the user.

public class coinGame {
    public static void main(String[] args) {
        int[] arr = {8,15,3,7};
        System.out.println(result(arr, 0, 3));
    }

    static int[][] mat = new int[4][4];

    static int result(int[] arr,int l,int r){
        if(l+1 == r){ 
            return (arr[l]>arr[r])?arr[l]:arr[r];
        }
        // memorization
        if(mat[l][r]!=0){
            return mat[l][r];
        }

        return mat[l][r] = Math.max((arr[l]+Math.min(result(arr,l+2,r),result(arr, l+1, r-1))),
                        arr[r]+Math.min(result(arr, l+1, r-1),result(arr, l, r-2)));
    }
}
