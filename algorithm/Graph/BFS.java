package algorithm.Graph;
import java.util.*;

class Graph{
    ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    int v;
    Graph(int vertex){
        v = vertex;
        while(vertex>0){
            g.add(new ArrayList<Integer>());
            vertex--;
        }
    }
    //Adding a single edge:
    void addEdge(int str,int end){
        g.get(str).add(end);
        g.get(end).add(str);
    }
    // Breadth First Travarsal :
    void bfs(int str){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        q.add(str);
        visited[str] = true;
        while(!q.isEmpty()){
            for(int i : g.get(q.peek())){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph(6); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 4); 
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5); 

        g.bfs(0);
    }
}
