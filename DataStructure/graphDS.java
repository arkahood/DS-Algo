package DataStructure;

import java.util.ArrayList;

class Graph{
    ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    int v;
    int[][] mat;
    Graph(int vertex){
        v = vertex;
        mat = new int[v][v];
        while(vertex>0){
            g.add(new ArrayList<Integer>());
            vertex--;
        }
    }
    //Adding a single edge:
    void addEdge(int str,int end){
        g.get(str).add(end);
        g.get(end).add(str);
        mat[str][end] = 1;
        mat[end][str] = 1;
    }
    //Adjacency List:
    void printGraph(){
        for(int i=0;i<v;i++){
            System.out.print("vertex "+i+"->");
            for(int j=0;j<g.get(i).size();j++){
                System.out.print(g.get(i).get(j)+"-->");
            }
            System.out.println("");
        }
    }
    //Adjacency Matrix:
    void printAdjMatrix(){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
public class graphDS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4);
        //print the Adjacency List: 
        g.printGraph();
        //print the Adjacency Matrix:
        g.printAdjMatrix();
    }
}
