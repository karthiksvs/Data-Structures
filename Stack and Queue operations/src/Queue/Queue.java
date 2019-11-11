package Queue;

import java.util.Scanner;
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Queue with arrays");
		op o=new op();
		String c;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Enqueue elemnts in queue \n2. Dequeue elemnts in queue \n3. display elemnts in queue \n4. Check queue is status\n");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();

			switch(n) {
			case 1:
				System.out.println("Enter number of elements you want to Enqueue in Queue");
				int i=s.nextInt();
				System.out.println("Enter data");
				int l=0;
				while(l!=i) {
					int k=s.nextInt();
				o.enqueue(k);
				l=l+1;
				}
				break;
			case 2:
				o.dequeue();
				break;
			case 3:
				o.dis();
				break;
			case 4:
				o.isempty();
				break;
			default:
				System.out.println("Choose correct option");
				System.exit(0);
			}
			System.out.println("Do you want to continue Y/N");
			c=s.next();
		}while(c.equals("Y")||c.equals("y"));
		System.out.println("Queue Exit");

	}

}
