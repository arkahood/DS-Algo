package DataStructure;

class node1<T>{
    T data;
    node1<T> next;
    node1(T data){
        this.data = data;
        next = null;
    }
}
class Stackds<T>{
    node1<T> Top;
    void push(T data){
        node1<T> new_node = new node1<>(data);
        if(Top == null){
            Top=new_node;
        }
        else{
            new_node.next = Top;
            Top = new_node;
        }
    }
    T pop(){
        T data;
        data = Top.data;
        Top = Top.next;
        return data;
    }
    T peek(){
        return Top.data;
    }
}
public class stack {
    public static void main(String[] args) {
        Stackds<String> s = new Stackds<>();
        s.push("oye");
        s.push("hello");
        s.push("hii");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
