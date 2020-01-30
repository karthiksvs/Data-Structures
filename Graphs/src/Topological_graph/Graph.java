package Topological_graph;
import java.util.*; 

//This class represents a directed graph using adjacency list representation 
class Graph 
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; // Adjacency List 

	Graph(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) { adj[v].add(w); } 

	// A recursive function used by topologicalSort 
	void topologicalSortUtil(int v, boolean visited[], 
							Stack stack) 
	{ 
		// Mark the current node as visited. 
		visited[v] = true; 
		Integer i; 

		// Recur for all the vertices adjacent to this vertex 
		Iterator<Integer> it = adj[v].iterator(); 
		while (it.hasNext()) 
		{ 
			i = it.next(); 
			if (!visited[i]) 
				topologicalSortUtil(i, visited, stack); 
		} 

		// Push current vertex to stack which stores result 
		stack.push(new Integer(v)); 
	} 

	// The function to do Topological Sort. It uses 
	// recursive topologicalSortUtil() 
	void topologicalSort() 
	{ 
		Stack stack = new Stack(); 

		// Mark all the vertices as not visited 
		boolean visited[] = new boolean[V]; 
		for (int i = 1; i < V; i++) 
			visited[i] = false; 

		// Call the recursive helper function to store 
		// Topological Sort starting from all vertices 
		// one by one 
		for (int i = 1; i < V; i++) 
			if (visited[i] == false) 
				topologicalSortUtil(i, visited, stack); 

		// Print contents of stack 
		while (stack.empty()==false) 
			System.out.print(stack.pop() + " "); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		// Create a graph given in the above diagram 
		Graph g = new Graph(10); 
		g.addEdge(1, 3); 
		g.addEdge(1, 4); 
		g.addEdge(2, 4); 
		g.addEdge(2, 5); 
		g.addEdge(4, 6); 
		g.addEdge(4, 7); 
		g.addEdge(7, 9); 
		g.addEdge(8, 9); 
		System.out.println("Following is a Topological " + "sort of the given graph"); 
		g.topologicalSort(); 
		System.out.println("\n\n");
		Graph g1 = new Graph(8); 
		g1.addEdge(1, 2); 
		g1.addEdge(1, 3); 
		g1.addEdge(2, 4); 
		g1.addEdge(2, 5); 
		g1.addEdge(3, 6); 
		g1.addEdge(4, 7); 
		g1.addEdge(5, 7); 
		g1.addEdge(6, 7); 
		System.out.println("Following is a Topological 2" + "sort of the given graph"); 
		g1.topologicalSort(); 
		System.out.println("\n\n");
		Graph g2 = new Graph(11); 
		g2.addEdge(1, 2); 
		g2.addEdge(1, 9); 
		g2.addEdge(1, 10); 
		g2.addEdge(3, 8); 
		g2.addEdge(3, 10); 
		g2.addEdge(5, 1); 
		g2.addEdge(7, 1); 
		g2.addEdge(7, 8);
		g2.addEdge(8, 9); 
		System.out.println("Following is a Topological 3" + "sort of the given graph"); 
		g2.topologicalSort(); 
		
	} 
} 