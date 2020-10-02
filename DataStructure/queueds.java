package DataStructure;

class queueNode<T>{
    T data;
    queueNode<T> next;
    queueNode(T data){
        this.data = data;
        next = null;
    }
}
class queue<T>{
    queueNode<T> front;
    queueNode<T> rear;
    boolean isempty(){
        if(rear == null) return true;
        return false;
    }
    int size(){
        int count=0;
        queueNode<T> itr = front;
        while(itr != null){
            count++;
            itr=itr.next;
        }
        return count;
    }
    void enqueue(T data){
        queueNode<T> new_node = new queueNode<>(data);
        if(isempty()){
            front = new_node;
            rear = new_node;
        }
        else{
            rear.next = new_node;
            rear = new_node;
        }
    }
    T dequeue(){
        T data;
        data = front.data;
        front = front.next;
        return data;
    }
    void print(){
        queueNode<T> itr = front;
        while(itr != null){
            System.out.print(itr.data+" ");
            itr = itr.next;
        }
        System.out.println("");
    }
}

public class queueds {
    public static void main(String[] args) {
        queue<Integer> q = new queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.print();
        q.enqueue(4);
        q.enqueue(5);
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        System.out.println("size: "+q.size());
    }
}
