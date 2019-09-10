package Q2;

import Q1.Edge;
import Q1.ListGraph;

import static Q1.TestQ1.is_acyclic_graph;
import static Q1.TestQ1.is_undirected;
import static Q1.TestQ1.ploth_graph;

public class TestQ2 {
    public static void main(String[] args) {//undirected and acyclic
        ListGraph g = new ListGraph(15, false);


        Edge e = new Edge(0, 1);
        Edge e2 = new Edge(1, 0);
        Edge e3 = new Edge(3, 6);
        Edge e4 = new Edge(4, 1);
        Edge e5 = new Edge(5, 1);
        Edge e6 = new Edge(6, 1);
        Edge e7 = new Edge(7, 9);
        Edge e8 = new Edge(8, 1);
        Edge e9 = new Edge(9, 7);
        Edge e10 = new Edge(9, 10);
        Edge e11 = new Edge(9, 11);
        Edge e12 = new Edge(9, 12);
        Edge e13 = new Edge(9, 13);
        Edge e14 = new Edge(13, 14);

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
        g.insert(e11);
        g.insert(e12);
        g.insert(e13);
        g.insert(e14);


        ploth_graph(g);
        System.out.println("Is Undirected : "+is_undirected(g));
        System.out.println("Is acyclic : "+is_acyclic_graph(g));

    }
}