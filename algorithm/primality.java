package algorithm;

import java.util.Scanner;

public class primality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(isPrime(n)){
            System.out.println("Prime NO.");
        }else{
            System.out.println("NON Prime NO.");
        }
        
    }
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
