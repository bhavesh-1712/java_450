package DAA;

import java.util.*;

/**
 * Print shortest path and cost for the directed graph  using bellman for algorithm
 * 
 * time complexity = O(E|V| - 1) 
 * 
 * Note : The time complexity of Bellman ford algorithm would be O(E|V| - 1). 
 * The bellman ford algorithm does not produce a correct answer 
 * if the sum of the edges of a cycle is negative.
 */
public class assignment_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter No of Vertices:");
		int V = sc.nextInt();
		
		System.out.println("\nEnter No of Edges:");
        int E = sc.nextInt();
        
        Graph graph = new Graph(V, E);

        for(V = 0; V < E; V++)
        {
        	System.out.println("\nEnter " + (V + 1) + " Edge's Values as src dest wei:");
        	
        	graph.edge[V].src = sc.nextInt();
        	graph.edge[V].dest = sc.nextInt();
        	graph.edge[V].weight= sc.nextInt();
        }

        System.out.println("\nEnter Src:");
        V = sc.nextInt();
        
        graph.BellmanFord(graph, V);
		sc.close();
	}

	public static class Graph
	{
		    class Edge
		    {
		        int src, dest, weight;
		        
		        Edge()
		        {
		            src = dest = weight = 0;
		        }
		        
		    };
		 
		    int V, E;
		    Edge edge[];
		 
		    Graph(int v, int e)
		    {
		        V = v;
		        E = e;
		        edge = new Edge[e];
		        
		        for(int i = 0; i < e; ++i)
		        {
		            edge[i] = new Edge();
		        }
		        
		    }
		    
		    void BellmanFord(Graph graph, int src)
		    {
		        int V = graph.V, E = graph.E;
		        int dist[] = new int[V];
		        
		        for(int i = 0; i < V; ++i)
		        {
		        	dist[i] = Integer.MAX_VALUE;
		        }
		        
		        dist[src] = 0;

		        for(int i = 1; i < V; ++i)
		        {
		            for(int j = 0; j < E; ++j)
		            {
		                int u = graph.edge[j].src, v = graph.edge[j].dest, weight = graph.edge[j].weight;
		                
		                if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
		                {
		                    dist[v] = dist[u] + weight;
		                }
		                
		            }
		            
		        }
		 
		        for(int j = 0; j < E; ++j)
		        {
		        	int u = graph.edge[j].src, v = graph.edge[j].dest, weight = graph.edge[j].weight;
		        	
		        	if((dist[u] != Integer.MAX_VALUE) && (dist[u] + weight < dist[v]))
		        	{
		        		System.out.println("\nGraph contains negative weight cycle");
		                return;
		            }
		        	
		        }
		        

		    	System.out.println("\nVertex Distance from Source:");

		    	for(int i = 0; i < V; ++i)
		    	{
		    		if(dist[i] != Integer.MAX_VALUE)
		    		{
		    			System.out.println(i + "\t\t" + dist[i]);
		    		}
		    		
		    		else
		    		{
		    			System.out.println(i + "\t\tPath Doesn't Exist!");
		    		}
		    		
		    	}
		    	
		    }
		    
		}
	
}

