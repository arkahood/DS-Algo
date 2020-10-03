package algorithm;

public class gcdEuclid {
    public static void main(String[] args) {
        System.out.println(gcd(24,18));
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    
}
