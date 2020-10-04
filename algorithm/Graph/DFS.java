package algorithm.Graph;
import java.util.*;

class graph1{
    ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    int v;
    graph1(int vertex){
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
    // Depth First Travarsal :
    void dfs(int str){
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[v];
        s.push(str);
        visited[str] = true;
        while(!s.isEmpty()){
            int pop_value = s.pop();
            System.out.print(pop_value+" ");
            for(int i : g.get(pop_value)){
                if(visited[i]!=true){
                    s.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}

public class DFS {
    public static void main(String[] args) {
        graph1 g = new graph1(6); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 4); 
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5); 

        g.dfs(0);
    }
}
