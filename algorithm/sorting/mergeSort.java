package algorithm.sorting;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,10,7,49,34};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr,int l,int u) {
		if(l<u) {
			int mid = (l+u)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,u);
			
			merge(arr,l,mid,u);
		}
	}
	public static void merge(int[] arr,int l,int mid,int u) {
		int n1 = mid-l+1;
		int n2 = u-mid;
		int[] temp1 = new int[n1];
		int[] temp2 = new int[n2];
		for(int i=0;i<n1;i++) {
			temp1[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			temp2[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(temp1[i]<temp2[j]) {
				arr[k] = temp1[i];
				i++;
				k++;
			}
			else {
				arr[k] = temp2[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k]=temp1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = temp2[j];
			j++;
			k++;
		}
	}
}
