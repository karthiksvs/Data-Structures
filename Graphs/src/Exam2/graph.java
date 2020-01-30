package Exam2;

import java.util.*; 

class graph 
{ 
	int V;// No. of vertices 
	List <Integer> adj[]; 
	public graph(int V)// Constructor 
	{ 
		this.V = V; 
		adj = new ArrayList[V]; 
		for(int i = 1; i < V; i++) 
			adj[i]=new ArrayList<Integer>(); 
	} 
	
	public void addEdge(int u,int v) 
	{ 
		adj[u].add(v); 
	} 
	public void topologicalSort() 
	{ 
		int indegree[] = new int[V]; 
		for(int i = 1; i < V; i++) 
		{ 
			ArrayList<Integer> temp = (ArrayList<Integer>) adj[i]; 
			for(int node : temp) 
			{ 
				indegree[node]++; 
			} 
		} 
		Queue<Integer> q = new LinkedList<Integer>(); 
		for(int i = 1;i < V; i++) 
		{ 
			if(indegree[i]==0) 
				q.add(i); 
		} 
		
		int cnt = 0; 
		Vector <Integer> topOrder=new Vector<Integer>(); 
		while(!q.isEmpty()) 
		{ 
			int u=q.poll(); 
			topOrder.add(u); 
			for(int node : adj[u]) 
			{ 
				// If in-degree becomes zero, add it to queue 
				if(--indegree[node] == 0) 
					q.add(node); 
			} 
			cnt++; 
		} 
		for(int i : topOrder) 
		{ 
			System.out.print(i+" "); 
		} 
	} 
//Driver program to test above functions 
	public static void main(String args[]) 
	{ 
		// Create a graph given in the above diagram 
		System.out.println("Enter the number of vertices");
		Scanner s=new Scanner(System.in);
		int ver=s.nextInt();
		System.out.println("Enter the number of Edges");
		int edg=s.nextInt();
		graph g=new graph(edg);
		int arr[]=new int[ver];
		int k=1;
		String s1="";
		System.out.println("Enter the number of vertices and edges");
		for(int i=1;i<edg+1;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
		g.addEdge(v1, v2);
		String s2=Integer.toString(v1);
		s1=s1+s2;
		s2="";
		}
		System.out.println("Following is a Topological Sort"); 
		g.topologicalSort(); 
		System.out.println("The island that cannot go is :");
		for(int i=1;i<ver+1;i++) {
			String s3=Integer.toString(i);
			if(!s1.contains(s3)) {
				System.out.println(i+"  ");
			}
		}
		} 
	}
