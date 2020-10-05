package algorithm;

public class binaryExp{
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        System.out.println(exp(a,b));
    }
    static long exp(int a,int b){
        long res =1;
        while(b>=1){
            if(b%2==0){
                a = a*a;
                b = b/2;
            }
            else{
                res *= a;
                b--;
            }
        }
        return res;
    }
}