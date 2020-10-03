package algorithm;
//contiguous sub-array with maximum sum.

public class kadane {
    public static void main(String[] args) {
        int[] arr = {1, 9 ,-5 ,7 ,-9,8};
        int res = maxSubarr(arr);
        System.out.println(res);
    }
    static int maxSubarr(int[] arr){
        int currCount=0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currCount = currCount + arr[i];
            if(currCount>max_so_far){
                max_so_far=currCount;
            }
            if(currCount<0){
                currCount = 0;
            }
        }
        return max_so_far;
    }
}
