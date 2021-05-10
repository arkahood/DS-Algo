package algorithm.recursion_Backtracking;

//cheack whether the string is palindrome or not.

public class palindrome {
    public static void main(String[] args) {
        String s = new String("abcba");
        System.out.println("String is palindrome : "+isPalindrome(s,0,s.length()-1));
    }
    static boolean isPalindrome(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return isPalindrome(s, l+1, r-1);
    }
}
