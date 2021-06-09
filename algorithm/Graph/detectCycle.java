package algorithm.Graph;

import java.util.ArrayList;

class grap{
    ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    
    grap(int n){
        for(int i=0;i<=n;i++){
            g.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int p1,int p2){
        g.get(p1).add(p2);
        g.get(p2).add(p1);
    }

    boolean DFSCycle(int curr,int parent,boolean[] visited){
        visited[curr] = true;
        for(int i : g.get(curr)){
            if(!visited[i]){
                if(DFSCycle(i, curr, visited))
                    return true;
            }else{
                if(parent == i){
                    continue;
                }else{
                    return true;
                }
            }
        }
        return false;

    }
}

public class detectCycle {
    public static void main(String[] args) {
        grap g = new grap(5);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 2);
        boolean[] visited = new boolean[6];
        if(g.DFSCycle(1, -1, visited)){
            System.out.println("Cycle PRESENT");
        }
        else{
            System.out.println("Cycle NOT Present");
        }
    }
}
