package Adjacency_List;

import java.util.LinkedList;
public class AdjacencyList {
	int	count;						
	private	LinkedList<LinkedList<Edge>>	Adj;
	private	static	class	Edge	{
		private	int	dest;
		private	int	cost;
		
	public	Edge(int	dst,	int	cst)	{
		dest	=	dst;		
		cost	=	cst;	
		}	
	}
	public	AdjacencyList(int	cnt)	{
		count	=	cnt;		
		Adj	=	new	LinkedList<LinkedList<Edge>>();	
		for	(int	i	=	0;	i	<	cnt;	i++)	{	
			Adj.add(new	LinkedList<Edge>());				
			}					
		}
	private	void	addDirectedEdge(int	source,	int	dest,	int	cost)	{	
		Edge	edge	=	new	Edge(dest,	cost);			
		Adj.get(source).add(edge);					
		}
	public	void	addDirectedEdge(int	source,	int	dest)	{	
		addDirectedEdge(source,	dest,	1);					
		}
	public	void	addUndirectedEdge(int	source,	int	dest,	int	cost)	{	
		addDirectedEdge(source,	dest,	cost);									
		addDirectedEdge(dest,	source,	cost);			
		}
	public	void	addUndirectedEdge(int	source,	int	dest)	{	
		addUndirectedEdge(source,	dest,	1);					
		}
	public	void	print()	{						
		for	(int	i	=	1;	i	<	count-1;	i++)	{		
			LinkedList<Edge>	ad	=	Adj.get(i);				
			System.out.print("\n	Vertex	"	+	i	+	"	is	connected	to	:	");	
			for	(Edge	adn	:	ad)	{								
				System.out.print("("	+	adn.dest	+	",	"	+	adn.cost	+	")	");		
				}
			}
		}
	public	static	void main(String[]	args)	{						
		AdjacencyList	gph	=	new	AdjacencyList(6);					
		gph.addDirectedEdge(1,	2,	2);				
		gph.addDirectedEdge(1,	4,	5);					
		gph.addDirectedEdge(2,	3,	14);			
		gph.addDirectedEdge(2,	4,	5);			
		gph.addDirectedEdge(2,	5,	4);		
		gph.addDirectedEdge(3,	5,	34);			
		gph.addDirectedEdge(4,	5,	58);			
		gph.print();						
		} 
}