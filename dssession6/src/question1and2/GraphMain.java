package question1and2;


import java.util.*;
/**

 * This is main driver function of graph.
 */
public class GraphMain
{
    private static Scanner sc;

	public static void main(String args[]) {
    	
    	sc = new Scanner(System.in);
    	
    	int vertices,edges ;
    	System.out.println("Enter the number of vertices in graph :");
    	vertices = sc.nextInt();
    	System.out.println("Enter the number of edges in graph :");
    	edges = sc.nextInt();
    	
        Graph graph = new Graph(vertices);
        
        int source , destination,weight ;
        
        for(int i=0;i<edges;i++){
        	System.out.println("Enter details of edge : "+i);
        	System.out.print("source : ");
        	source = sc.nextInt();
        	System.out.print("destination : ");
        	destination = sc.nextInt();
        	System.out.print("weight : ");
        	weight = sc.nextInt();
        	graph.addEdge(source,destination,weight);
        }
        
        System.out.println("Graph created.. ");
        
        
//        graph.addEdge(0, 1, 4);
//        graph.addEdge(0, 2, 3);
//        graph.addEdge(1, 2, 1);
//        graph.addEdge(1, 3, 2);
//        graph.addEdge(2, 3, 4);
        
        System.out.println("Graph created.. ");
        graph.printGraph();

        System.out.println("\nIs graph connected ? "+graph.isConnected());

        
        System.out.println("\nchecking reachable vertices from given vertex ..");
        System.out.println("enter vertex : ");
        source = sc.nextInt();
        List<Integer> listOfReachable = graph.reachable(source);
        System.out.println("reachable vertices are : "+listOfReachable.toString());

        
        System.out.println("\nThe minimum spanning tree is : \n");
        List<EdgeAndVertices> mst = graph.minimumSpanningTree();
       
       for(EdgeAndVertices mstList:mst){
		System.out.println(" Source: "
                + mstList.getSource() + " Destination: "
                + mstList.getDestination() + " Weight: " + mstList.getWeight());
        }
        
        System.out.println("\nFinding shortest path ..");
        System.out.print("enter source : ");
    	source = sc.nextInt();
    	System.out.print("enter destination : ");
    	destination = sc.nextInt();
        List<EdgeAndVertices> spt = graph.shortestPath(source, destination);

        	for(EdgeAndVertices sptList:spt) { 
        	System.out.println(" Source : "
                + sptList.getSource() + " Destination : "
                + sptList.getDestination() + " Distance : " + sptList.getWeight());
        }
    }
}
