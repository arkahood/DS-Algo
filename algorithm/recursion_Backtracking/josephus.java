package algorithm.recursion_Backtracking;

public class josephus {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println("winner is : "+joseph(n,k));
    }
    static int joseph(int n, int k){
        if(n == 1){
            return 0;
        }
         return (joseph(n-1, k)+k)%n;
    }
}
