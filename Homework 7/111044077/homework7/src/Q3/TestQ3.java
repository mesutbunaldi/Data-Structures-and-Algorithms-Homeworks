package Q3;

import Q1.Edge;
import Q1.ListGraph;
import Q1.*;

import static Q1.TestQ1.is_acyclic_graph;
import static Q1.TestQ1.is_undirected;
import static Q1.TestQ1.ploth_graph;

public class TestQ3 {
    public static void main(String[] args) {//undirected and acyclic
        ListGraph g = new ListGraph(10, false);


        Edge e = new Edge(0, 1);
        Edge e2 = new Edge(1, 2);
        Edge e3 = new Edge(1, 3);
        Edge e4 = new Edge(1, 4);
        Edge e5 = new Edge(3, 5);
        Edge e6 = new Edge(3, 6);
        Edge e7 = new Edge(3, 7);
        Edge e8 = new Edge(7, 9);
        Edge e9 = new Edge(7, 8);
        Edge e10 = new Edge(3, 0);



        g.insert(e);
        g.insert(e2);
        g.insert(e3);
        g.insert(e4);
        g.insert(e5);
        g.insert(e6);
        g.insert(e7);
        g.insert(e8);
        g.insert(e9);
        g.insert(e10);



        ploth_graph(g);
        System.out.println("Is Undirected : "+is_undirected(g));
        System.out.println("Is acyclic : "+is_acyclic_graph(g));

        DepthFirstSearch dfs=new DepthFirstSearch(g);
        int [] a=dfs.getFinishOrder();

        int [] temp=BreadthFirstSearch.breadthFirstSearch(g,6);

        System.out.println("BFS           DFS");
        for (int i = 0; i <10 ; i++) {
            System.out.println(temp[i]+"               "+a[i]);
        }



    }
}
