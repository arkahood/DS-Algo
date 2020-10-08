package algorithm.Graph;

import java.util.ArrayList;

class edge{
    int pt1;
    int pt2;
    int weight;
    edge(int pt1,int pt2,int weight){
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.weight = weight;
    }
}
class graph2{
    ArrayList<ArrayList<edge>> g = new ArrayList<>();
    int V;
    graph2(int Vertices){
        V = Vertices;
        while(Vertices>0){
            g.add(new ArrayList<edge>());
            Vertices--;
        }
    }
    public void addEdge(int src,int dest,int weight){
        edge e1 = new edge(src,dest,weight);
        edge e2 = new edge(dest,src,weight);
        g.get(src).add(e1);
        g.get(dest).add(e2);
    }
    public int[] dijkstra(int s){
        int[] d = new int[V];
        //Initially dist of every vertex from src = Infinity
        for(int i=0;i<V;i++) d[i]=Integer.MAX_VALUE;
        // Visited array to keep track of the vertex i visit
        boolean[] visited = new boolean[V];
        //src to src = 0
        d[s] = 0;
        for(int i=0;i<V;i++){
            int minNei = -1;
            
            for(int j=0;j<V;j++){
                if(!visited[j] && (minNei==-1 || d[j]<d[minNei])){
                    minNei = j;
                }
            }
            if(d[minNei]==Integer.MAX_VALUE) break;

            visited[minNei] = true;
            for(edge e : g.get(minNei)){
                int to = e.pt2;
                int len = e.weight;
                if(d[minNei]+len<d[to]){
                    d[to] = d[minNei]+len;
                }
            }
        }

        return d;
    }

}
public class Dijkstras {
    public static void main(String[] args) {
        graph2 g = new graph2(6);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 3);
        g.addEdge(1, 3, 2);
        g.addEdge(1, 2, 5);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 2);
        g.addEdge(4, 0, 4);
        g.addEdge(4, 1, 4);
        g.addEdge(4, 5, 6);
        int[] res = new int[6];
        res = g.dijkstra(0);
        for(int i=0;i<6;i++){
            System.out.println("Source Vertex: 0 to vertex "+i+" distance : "+res[i]);
        }
    }
}
