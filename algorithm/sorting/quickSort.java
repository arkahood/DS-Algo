package algorithm.sorting;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,10,7,49,34};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr,int str,int l){
        if(str<l){
            int p = partition(arr,str,l);
            sort(arr,str,p-1);
            sort(arr,p+1,l);
        }
    }
    static int partition(int[] arr,int str,int l){
        int data = arr[str];
        int j=l;
        int temp;
        for(int i =str+1;i<=l;i++){
            if(arr[i]>data){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        arr[str] = arr[j];
        arr[j] = data;

        return j;

    }
}
