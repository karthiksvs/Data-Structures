package LinkedList;

import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SingleLInkedListImpl ob=new SingleLInkedListImpl();
		SingleLInkedListImpl ob1=new SingleLInkedListImpl();
		int c=0;
		while(c!=8) {
			System.out.println("for which object you want to perform linked operations:(1/2)");
			int whi=sc.nextInt();
			System.out.println("1.Add Data\n2.Add Data as head \n3.Display\n4.Add Elemnt in middle\n5.Del node in Start\n6.Del last Element\n"
					+ "7.Del Elemnt in middle\n8.common in lists\n9.Add element in particular position\n10.reverse of Linkedlist\n11.Delete element "
					+ "in particular position\n12.Sort lists\n13.Concat two lists\n14.PairWise Swap\n15.Exit\n");
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
					if(whi==1)
						ob.add(data);
					else
						ob1.add(data);
				}
				b=b+a;
				break;
			case 2:
				System.out.println("Enter data to add in start");
				int dat=sc.nextInt();
				if(whi==1)
					ob.addst(dat);
				else
					ob1.addst(dat);
				break;
			case 3:
				if(whi==1)
					ob.display();
				else
					ob1.display();
				break;
			case 4:
				System.out.println("Enter data to add in middle");
				int d=sc.nextInt();
				if(whi==1)
					ob.insertAtMiddle(d);
				else
					ob1.insertAtMiddle(d);
				break;
			case 5:
				if(whi==1)
					ob.delst();
				else
					ob1.delst();
				break;
			case 6:
				if(whi==1)
					ob.dellt();
				else
					ob1.dellt();
				break;
			case 7:
				if(whi==1)
					ob.delAtMiddle();
				else
					ob1.delAtMiddle();
				break;
			case 8:
				ob.common(ob.head,ob1.head);
				break;
			case 9:
				System.out.println("Enter position to add element");
				int d1=sc.nextInt();
				System.out.println("Enter data to add ");
				int d2=sc.nextInt();
				if(whi==1)
					ob.insertAtPosition(d2,d1);
				else
					ob1.insertAtPosition(d2, d1);
				break;
			case 10:
				if(whi==1)
					ob.reverse();
				else
					ob1.reverse();
				break;
			case 11:
				System.out.println("Enter position to delete element");
				int de1=sc.nextInt();
				if(whi==1)
					ob.deleteAtPosition(de1);
				else
					ob1.deleteAtPosition(de1);
				break;
			case 12:
				if(whi==1)
					ob.sort();
				else
					ob1.sort();
				break;
			case 13:
				ob.concat(ob.head,ob1.head);
				break;
			case 14:
				if(whi==1)
					ob.pairWiseSwap();
				else
					ob1.pairWiseSwap();
				break;
			case 15:
				c=8;
				System.out.println("Linked List Completed");
				System.exit(0);
				break;
			}
		}	
	}
}