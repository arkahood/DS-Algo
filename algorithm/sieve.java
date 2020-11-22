package algorithm;
import java.util.*;

public class sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] res = new int[n+1];
        sievePrime(n,res); 
        for (int i = 2; i < res.length; i++) {
            if(res[i]==0) System.out.println(i);
        }  
    }
    static void sievePrime(int n,int[] res){
        for (int i = 2; i*i < res.length; i++) {
            if(res[i]==0){
                for (int j = i+i; j < res.length; j=j+i) {
                    res[j] = 1;
                }
            }
        }
    }

}
