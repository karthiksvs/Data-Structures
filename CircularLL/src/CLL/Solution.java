package CLL;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int count=0;

	static class Node 
	{ 
		int data; 
		Node next; 
	} 

	static class Queue 
	{ 
		Node front, rear; 
		void isempty()
		{
			if(count < 0)
			{
				System.out.println( " Circular Queue is empty");
			}
			else
			{
				System.out.println( "Circular Queue is not empty");
			}
		}
	} 

	static void enQueue(Queue q, int value) 
	{ 
		Node temp = new Node(); 
		temp .data = value; 
		if (q .front == null) {
			q .front = temp; 
			count=count+1;
		}
		else {
			q .rear .next = temp; 	
			count=count+1;
		}
		q .rear = temp; 
		q .rear .next = q .front; 
	} 

	static int deQueue(Queue q) 
	{ 
		if (q .front == null) 
		{ 
			System.out.printf ("Queue is empty"); 
			return Integer.MIN_VALUE; 
		} 
		int value; 
		if (q .front == q .rear) 
		{ 
			value = q .front .data; 
			q .front = null; 
			q .rear = null; 
			count=count-1;

		} 
		else  
		{ 
			Node temp = q .front; 
			value = temp .data; 
			q .front = q .front .next; 
			q .rear .next= q .front; 
			count=count-1;

		} 
		return value ; 
	} 
	static void MIDELE(Queue q) {
		int m=count/2;
		Node temp=q.front;
		for(int i=0;i<count;i++) {
			if(m==i) {
				int j=temp.data;
				char c=(char) (j);
				System.out.println("Middle Element of Circular Queue is:"+c);
			}
			temp=temp.next;
		}
	}

	static void displayQueue( Queue q) 
	{ 
		Node temp = q .front; 
		System.out.println("\nElements in Circular Queue are: "); 
		if(count>0) {
		while (temp .next != q .front) 
		{ 
			int i=temp.data;
			char c=(char) (i);
			System.out.println(c); 
			temp = temp .next; 
		} 
		int i=temp.data;
		char c=(char) (i);
		System.out.println(c); 
		}
		else {
			System.out.println("No Elements present");
		}
	} 

	static void loop(Queue q) {
		Node temp=q.front;
		int ar[]=new int[count]; 
		for(int i=0;i<count;i++) {
			ar[i]=temp.data;
			temp=temp.next;
		}
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ar[i+1] && i<ar.length-2) {
				char c=(char) (ar[i]);
				System.out.println("Loop Strting at:"+c); 
				break;
			}
		}
	}
	public static void main(String args[]) 
	{ 
		// Create a queue and initialize front and rear 
		Queue q = new Queue(); 
		q .front = q .rear = null; 
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Circular Queue Operations");
		while(c!=8) {
			System.out.println("1.Enqueue data to Queue\n2.Dequeue element from Queue \n3.Display Queue\n4.Queue Status\n"
					+ "5.Middle Elemnet\n6.Loop\n7.Exit\n");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data size to add");
				int a=sc.nextInt();
				int b=0;
				for(int i=0;i<a+b;i++) {
					System.out.println("Enter data");
					String data=sc.next();
					data=data.toUpperCase();
					for(int j=0;j<data.length();j++) {
						char character = data.charAt(j); 
						int ascii = (int) character; 	
						enQueue(q, ascii);
						break;
					}
				}
				b=b+a;
				break;
			case 2:
				int i= deQueue(q);
				char c1=(char) (i);
				System.out.println("\nDeleted Element ="+c1); 
				break;
			case 3:
				displayQueue(q); 
				break;
			case 4:
				q.isempty();
				break;
			case 5:
				MIDELE(q);
				break;
			case 6:
				loop(q);
				break;
			case 7:
				c=8;
				System.out.println("Circular Queue Using liked list completed");
				System.exit(0);
				break;
			}
		}
	} 
} 