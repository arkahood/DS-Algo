package algorithm.recursion_Backtracking;

public class catalan {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        for (int i : arr) {
            System.out.println(cat(i));
        }
    }
    // c0 = 1;    c(n+1) = summ(i=0->n){c(i)*c(n-i)}
    static int cat(int n){

        if(n<=1){
            return 1;
        }
        int res = 0;
        for(int i = 0;i<n; i++){
            res += cat(i)*cat(n-i-1);
        }

        return res;
    }
}
