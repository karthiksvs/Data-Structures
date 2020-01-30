package Exam1;
import java.util.*;

public class transposeGraph {
	int	count;						
	private	LinkedList<LinkedList<Edge>> tpg;
	private	static	class	Edge	{
		private int dest;
		private Edge(int dst) {
			dest=dst;
		}
	}
	public transposeGraph(int count1) {
		count	=	count1;		
		tpg	=	new	LinkedList<LinkedList<Edge>>();	
		for(int i=0;i<count;i++) {
			tpg.add(new LinkedList<Edge>());
		}
	}
	
	public void addDirectedEdge(int src,int dest) {
	Edge e=new Edge(dest);
		tpg.get(src).add(e);					
	}
	public void print() {
		for(int i=1;i<count-2;i++) {
			LinkedList<Edge>	ad	=	tpg.get(i);				
			System.out.print("\n	Vertex	"	+	i	+	" is connected	to	:");	
			for	(Edge	adn	:	ad)	{								
				System.out.print(adn.dest+" ");		
				}
			}
	}
	public void addDirectedEdge1(int src,int dest) {
		Edge e=new Edge(src);
			tpg.get(dest).add(e);					
		}
	public void print1() {
		for(int i=1;i<count-2;i++) {
			LinkedList<Edge>	ad	=	tpg.get(i);				
			System.out.print("\n	Vertex	"	+	i	+	" is connected	to	:");	
			for	(Edge	adn	:	ad)	{								
				System.out.print(adn.dest+" ");		
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transposeGraph t=new transposeGraph(8);
		System.out.println("Given Graph is");
		t.addDirectedEdge(1, 2);
		t.addDirectedEdge(2, 3);
		t.addDirectedEdge(3, 1);
		t.addDirectedEdge(3, 5);
		t.addDirectedEdge(5, 4);
		t.addDirectedEdge(4,5);
		t.addDirectedEdge(5, 5);
		t.addDirectedEdge(5,4);
		t.print();
		System.out.println("\nTranspose of given Graph is");
		transposeGraph t1=new transposeGraph(8);
		t1.addDirectedEdge1(1, 2);
		t1.addDirectedEdge1(2, 3);
		t1.addDirectedEdge1(3, 1);
		t1.addDirectedEdge1(3, 5);
		t1.addDirectedEdge1(5, 4);
		t1.addDirectedEdge1(4,5);
		t1.addDirectedEdge1(5, 5);
		t1.addDirectedEdge1(5,4);
		t1.print1();
	}

}
