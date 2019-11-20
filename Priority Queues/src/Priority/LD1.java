package Priority;
import java.util.*; 

public class LD1 {

	public static void main(String[] args) {
					PriorityQueue<String> p = new PriorityQueue<String>(); 
					Scanner s=new Scanner(System.in);
					int c=0;
					while(c!=9) {
						System.out.println("1.Perform operations\n2.Display\n3.Exit");
						System.out.println("Enter your choice:");
						int op=s.nextInt();
						switch(op) {
						case 1:	
							System.out.println("Enter data");
					String s1=s.next();
					s1=s1.toLowerCase();
					if(s1.equals("*")) {
						p.remove();
						System.out.println("Element has been removed");
					}
					else {
						p.add(s1);
					}
					break;
						case 2:
							System.out.println("elements are");
							Iterator itr = p.iterator(); 
							while (itr.hasNext()) 
								System.out.println(itr.next()); 
							break;
						case 3:
							c=9;
							System.out.println("Exiting priority Queue");
							System.exit(0);
							break;
						}
					}
					
	}

}
