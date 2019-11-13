package DLL;

import java.util.Scanner;

public class DLL_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DLL ob=new DLL();
		System.out.println("Doubly Linked List Started");
		int c=0;
		int b=0;
		while(c!=8) {
			System.out.println("0.Add Elemnts \n1.Add Head\n2.Add element in last \n3.Display\n4.Sort List \n5.Del node in start\n6.Del last element\n"
					+ "7.Del PArticular Element \n8.Empty or not \n9.Revese the List\n10.Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
		switch(ch) {
		case 0:
			System.out.println("Enter data size to add");
			int a=sc.nextInt();
			for(int i=0;i<a;i++) {
				System.out.println("Enter data");
				int data=sc.nextInt();
				ob.add(data);
			}
			b=b+a;
			break;
		case 1:
			System.out.println("Enter data");
			int data=sc.nextInt();
			ob.addHead(data);
			b=b+1;
			break;
		case 2:
			System.out.println("Enter data to add in End");
			int dat=sc.nextInt();
			ob.InsertEnd(dat);
			b=b+1;
			break;
		case 3:
			ob.display();
			break;
		case 4:
			ob.sortList();
			break;
		case 5:
			b=b-1;
			System.out.println("Deleted Head Node is:"+ob.removeHead());
			break;
		case 6:
			b=b-1;
			System.out.println("Deleted Tail Node is:"+ob.removeTail());
			break;
		case 7:
			b=b-1;
			System.out.println("Enter position to remove data");
			int pos=sc.nextInt();
			ob.removeNode(pos);
			break;
		case 8:
			ob.isempty();
			break;
		case 9:
			ob.reverseList();
			break;
		case 10:
			c=8;
			System.out.println("Doubly Linked List Completed");
			System.exit(0);
			break;
		}
		}
		
	}

}