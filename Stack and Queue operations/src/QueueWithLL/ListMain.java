package QueueWithLL;

import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue ob=new Queue();
		int c=0;
		System.out.println("Queue Operations");
		while(c!=8) {
			System.out.println("1.Enqueue data to Queue\n2.Dequeue element from Queue \n3.Display Queue\n4.Queue Status\n5.Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter data size to add");
			int a=sc.nextInt();
			int b=0;
			for(int i=0;i<a+b;i++) {
				
				System.out.println("enter data");
				int data=sc.nextInt();
				ob.Enqueue(data);
			}
			b=b+a;
			break;
		case 2:
			ob.Dequeue();
			break;
		case 3:
			ob.display();
			break;
		case 4:
			ob.isempty();
			break;
		case 5:
			c=8;
			System.out.println("Queue Using liked list completed");
			System.exit(0);
			break;
		}
		}
		
	}
}