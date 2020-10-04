package algorithm;

import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) {
        String s = "{[(])}";
        System.out.println(check(s));
    }
    static boolean check(String s){
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for(char ch : str){
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
                continue;
            }
            else if(ch=='}'){
                if(st.isEmpty()) return false;
                else if(st.peek()=='{') st.pop();
                else return false;
            }
            else if(ch==']'){
                if(st.isEmpty()) return false;
                else if(st.peek()=='[') st.pop();
                else return false;
            }
            else if(ch==')'){
                if(st.isEmpty()) return false;
                else if(st.peek()=='(') st.pop();
                else return false;
            }
            
        }
        if(st.isEmpty()) return true;
        return false;   
    }
}
