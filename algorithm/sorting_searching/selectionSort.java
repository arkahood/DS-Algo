package algorithm.sorting_searching;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,10,7,49,34};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr){
        int min;
        int temp;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min != i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
