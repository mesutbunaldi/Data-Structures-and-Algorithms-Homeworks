package Q1;

import java.util.Iterator;
import java.util.Vector;

public class TestQ1 {

    public static void main(String [] args)
    {
        ListGraph g=new ListGraph(10,true);


        Edge e=new Edge(1,2,10);
        Edge e2=new Edge(2,3,14);
        Edge e3=new Edge(1,4,12);
        Edge e4=new Edge(4,5,122);
        Edge e5=new Edge(5,6,32);
        Edge e6=new Edge(6,7,44);
        Edge e7=new Edge(7,8,54);
        Edge e8=new Edge(8,9,8);
        Edge e9=new Edge(9,3,19);
        Edge e10=new Edge(2,1,65);
        Edge e11=new Edge(2,4,65);
        Edge e12=new Edge(2,5,65);
        Edge e13=new Edge(2,6,65);
        Edge e14=new Edge(3,6,65);
        Edge e15=new Edge(1,5,65);
        Edge e16=new Edge(9,4,65);
        Edge e17=new Edge(7,2,65);
        Edge e18=new Edge(3,9,65);
        Edge e19=new Edge(1,8,65);
        Edge e20=new Edge(8,6,65);

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
        g.insert(e15);
        g.insert(e16);
        g.insert(e17);
        g.insert(e18);
        g.insert(e19);
        g.insert(e20);

        ploth_graph(g);
        System.out.println("Is Undirected : "+is_undirected(g));
        System.out.println("Is acyclic : "+is_acyclic_graph(g));


    }

    public static boolean is_undirected(Graph g){
        return !g.isDirected();
    }

    public static void ploth_graph(ListGraph g){

        System.out.println(" -> (source,dest) : weigth");
        for(int v = 0; v < g.getNumV(); v++)
        {

            for (Iterator<Edge> it = g.edgeIterator(v); it.hasNext(); ) {
                Edge pCrawl = it.next();
                System.out.print(" -> "+pCrawl);
                if (!it.hasNext()){
                    System.out.print("\n");
                }
            }


        }
    }



    public Vector<Integer> shortest_path(Graph g,int v1,int v2){


        return null;
    }



    public static boolean is_acyclic_graph(ListGraph g){
        // Mark all the vertices as not visited and
        // not part of recursion stack
        boolean[] visited = new boolean[g.getNumV()];
        boolean[] recStack = new boolean[g.getNumV()];


        // Call the recursive helper function to
        // detect cycle in different DFS trees
        for (int i = 0; i < g.getNumV(); i++)
            if (g.isCyclicUtil(i, visited, recStack))
                return true;

        return false;
    }

}
