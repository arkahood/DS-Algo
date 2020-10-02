package DataStructure;

class node<T>{
    T data;
    node<T> next;
    node(T data){
        this.data = data;
        next = null;
    }
}
class Linked<T>{
    node<T> Head;
    //To cheack emptyness
    boolean isempty(){
        if(Head == null) return true;
        return false;
    }
    // to get the size
    int size(){
        int count = 0;
        if(isempty()) return -1;
        node<T> curr = Head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    // adding element at the end
    void add(T data){
        node<T> new_node = new node<>(data);
        if(isempty()){
            Head = new_node;
        }
        else{
            node<T> curr = Head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next =new_node;
        }
    }
    //print the linked list
    void print(){
        node<T> curr = Head;
        if(curr == null){
            System.out.println("Empty List");
        }
        else{
            while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
        System.out.println("");
    }
    //remove on the basis of index
    void remove(int index){
        if(index < size() && index!=0){
            node<T> curr = Head.next;
            node<T> precurr = Head;
            int i=1;
            while(i<index){
                precurr = curr;
                curr = curr.next;
                i++;
            }
            precurr.next = curr.next;
        }
        else if(index < size() && index==0){
            Head = Head.next;
        }
        else{
            System.out.println("index out of bound");
        }
    }
    // insert on the basis of index
    void insert(int index,T data){
        node<T> new_node = new node<>(data);
        if(index <=size() && index!=0){
            node<T> curr = Head.next;
            node<T> precurr = Head;
            int i=1;
            while(i<index){
                precurr = curr;
                curr = curr.next;
                i++;
            }
            new_node.next = curr;
            precurr.next = new_node;
        }
        else if(index <=size() && index==0){
            new_node.next = Head;
            Head = new_node;
        }
        else{
            System.out.println("index out of bound");
        }
    }
    // modify the data in particular index
    void set(int index,T data){
        if(index<size()){
            node<T> curr = Head;
            int i=0;
            while(i<index){
                curr=curr.next;
                i++;
            }
            curr.data =data;
        }
    }
}


public class linkedList{
    public static void main(String[] args) {
        Linked<Integer> l = new Linked<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.print("Linked List : ");
        l.print();
        l.remove(2);
        System.out.print("Linked List : ");
        l.print();
        l.insert(0,100);
        System.out.print("Linked List : ");
        l.print();
        l.set(3, 69);
        System.out.print("Linked List : ");
        l.print();
    }
}