package algorithm.recursion_Backtracking;

public class allSubSeq {
    public static void main(String[] args) {
        String s = new String("abc");
        String cur="";
        printAllSubSeq(s,0,cur);
    }
    static void printAllSubSeq(String s, int i,String curr){
         if(i == s.length()){
             System.out.println(curr);
             return;
         }
         printAllSubSeq(s, i+1, curr+s.charAt(i));
         printAllSubSeq(s, i+1, curr);
    }
}
