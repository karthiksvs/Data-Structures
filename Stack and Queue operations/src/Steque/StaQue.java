package Steque;

public class StaQue {
	
	Node head,tail;
	static int count=0;
	
	public void Enqueue(int data) {
		Node ob=new Node();
		ob.data=data;
		ob.next=null;

		if(head==null && tail==null) {
			head=ob;
			tail=ob;
			count=count+1;
		}

		else {
			tail.next=ob;
			tail=tail.next;
			count=count+1;
		}
	}

	public void push(int data) {
		
		Node ob=new Node();
		ob.data=data;
		ob.next=null;
		
		if(head==null && tail==null) {
			head=ob;
			tail=ob;
			count=count+1;
		}
		
		else {
			tail.next=ob;
			tail=tail.next;
			count=count+1;
		}
	}
	
	public void pop() {
		if(count<0) {
			System.out.println("Stack Underflow");
		}
		else {
		   Node newNode=new Node();
		   Node temp = head;
		   Node current = null;
		 
		   for(int i = 0; i < count-1; i++) {
		      current = temp;
		      temp = temp.next;
		   }
		   count=count-1;
		   if(count!=0) {
		   current.next = temp.next;
		   System.out.println("Element that is popped is: "+temp.data);
		   newNode.next=null;
		   }
		   else {
			   current = temp;
			   System.out.println("Element that is popped is: "+temp.data);
			   newNode.next=null;
			   head=null;
			      
		   }
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void isempty()
	{
		if(count <= 0)
		{
			System.out.println( " Stack is empty\n");
		}
		else
		{
			System.out.println( "Stack is not empty\n");
		}
	}

}
