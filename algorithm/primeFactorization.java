package algorithm;

import java.util.*;

public class primeFactorization {
    public static void main(String[] args) {
        int n = 12345678;
        List<Integer> l = new ArrayList<>();
        l = factor(n);
        System.out.println(l);
    }
    static List<Integer> factor(int n){
        List<Integer> l = new ArrayList<>();

        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                l.add(i);
                n /= i;
            }
        }
        if(n>1) l.add(n);

        return l;
    }
}
