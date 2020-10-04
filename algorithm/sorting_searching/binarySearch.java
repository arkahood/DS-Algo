package algorithm.sorting_searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,13,20,34,49,63};
        System.out.println(binaryRec(arr,0,arr.length-1,63));
        System.out.println(binaryS(arr,63));
    }
    // Iterative Approach
    static int binaryS(int[] arr,int data){
        int low = 0;
        int high = arr.length-1;
        int mid = (arr.length-1)/2;
        while(low<=high){
            if(arr[mid] == data){
                return mid;
            }
            if(arr[mid]>data){
                high = mid-1;
                mid = low+(high-low)/2;
            }
            if(arr[mid]<data){
                low = mid+1;
                mid = low+(high-low)/2;
            }
        }
        return -1;
    }
    // Recursive Approach
    static int binaryRec(int[] arr,int l,int r,int data){
        if(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>data) return binaryRec(arr, l, r-1, data);
            if(arr[mid]<data) return binaryRec(arr, l+1, r, data);
            if(arr[mid]==data) return mid;
        
        }
        return -1;
    }
}
