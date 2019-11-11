package QueueWithLL;

public class Queue {

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

	public void Dequeue() {
		if(count<0) {
			System.out.println("Stack Underflow");
		}
		else {
			Node ob=new Node();
			if(head.next!=null) {
				ob.next=head.next;
				System.out.println("Popped Dequeue Element is : "+head.data);
				head=ob.next;
				tail=head.next;
				count=count-1;
				while(tail!=null) {
					tail=tail.next;
				}
			}
			else {
				count=count-1;
				System.out.println("Popped Dequeue Element is : "+head.data);
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
		if(count <= 0){
			System.out.println( " Queue is empty\n");
		}
		else{
			System.out.println( "Queue is not empty\n");
		}
	}
}