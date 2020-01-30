package lowFareRouting;

public class Floyd {
	final static int INF = 99999, V = 29;

	void floydWarshall(Matrix adj,int graph[][],int sr,int d)
	{
		int dist[][] = new int[V][V];
		int path[][] =new int [V][V];
		int i, j, k;
		for (i = 0; i < V; i++) {
			for (j = 0; j < V; j++) {
				dist[i][j] = graph[i][j];
				if(i==j)
					path[i][j]=0;
				else if(dist[i][j]!=Integer.MAX_VALUE)
					path[i][j]=i;
				else
					path[i][j]=-1;
			}
		}

		for (k = 0; k < V; k++)
		{
			for (i = 0; i < V; i++)
			{
				for (j = 0; j < V; j++)
				{
					if (dist[i][k] + dist[k][j] < dist[i][j])
					{
						dist[i][j] = dist[i][k] + dist[k][j];
						path[i][j]=path[k][j];
					}
				}
			}
		}
		printSolution(adj,dist,sr,d);
		printSolution(dist,path);
	}
	
	void printSolution(int dist[][],int path[][])
	{
		System.out.println();
		System.out.println("The following matrix shows the shortest "+   "distances between every pair of vertices");
		for (int i=0; i<V; ++i)
		{
			for (int j=0; j<V; ++j)
			{
				if (dist[i][j]==INF)
					System.out.print("INF ");
				else {
					System.out.print(dist[i][j]+"   ");
				} //printPath(path,i,j);
			}
			System.out.println();
		}
	}

	void printPath(int path[][],int i,int j)
	{
		if(path[i][j]==i)
			return;
		printPath(path,i,path[i][j]);
		System.out.println(path[i][j]+" ");
	}
	
	void printSolution(Matrix a,int dist[][],int s,int d)
	{

		if (dist[s][d]==INF)
			System.out.print("INF ");
		else
			System.out.print(a.countries[s]+"------->"+a.countries[d]+" = "+dist[s][d]);
	}
}