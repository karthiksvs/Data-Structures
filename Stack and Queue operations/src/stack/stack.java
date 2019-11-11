package stack;

import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("stack with arrays");
		op o=new op();
		String c;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. push elemnts in stack \n2. pop elemnts in stack \n3. display elemnts in stack \n4. Check stack is status\n");
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
					o.push(k);
					l=l+1;
				}
				break;
			case 2:
				o.pop();
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
		System.out.println("Stack Exit");

	}

}