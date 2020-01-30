package Adjacency_Matrix;

public class AdjacencyMatrix {
	int	count;						
	int[][]	adj;
	AdjacencyMatrix(int	cnt)	{												
		count	=	cnt;
		adj	=	new	int[count][count];
		}
	public	void	addDirectedEdge(int	src,	int	dst,	int	cost)	{	
		adj[src][dst]	=	cost;	
		}
	public	void	addUndirectedEdge(int	src,	int	dst,	int	cost)	{
		addDirectedEdge(src,	dst,	cost);				
		addDirectedEdge(dst,	src,	cost);
		}
	public	void	print()	{	
		for	(int	i	=	1;	i	<	count;	i++)	{		
			System.out.print("Node	index	"	+	i	+	"	is	connected	with	:	");	
			for	(int	j	=	1;	j	<	count;	j++)	{	
				if	(adj[i][j]	!=	0)
					System.out.print(j	+	"	");	
				}								
			System.out.println("");						
			}						
		}
	public	static	void	main(String[]	args)	{	
		AdjacencyMatrix	graph	=	new	AdjacencyMatrix(7);			
		graph.addUndirectedEdge(1,	2,	7);			
		graph.addUndirectedEdge(1,	3,	9);			
		graph.addUndirectedEdge(1,	6,	14);		
		graph.addUndirectedEdge(2,	3,	10);
		graph.addUndirectedEdge(2,	4,	15);			
		graph.addUndirectedEdge(3,	4,	11);			
		graph.addUndirectedEdge(3,	6,	2);		
		graph.addUndirectedEdge(4,	5,	6);
		graph.addUndirectedEdge(6,	5,	9);
		graph.print();					
		} 
}
