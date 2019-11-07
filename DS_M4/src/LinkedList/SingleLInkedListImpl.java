package LinkedList;
public class SingleLInkedListImpl {
	Node head,tail;
	static int count=0;

	public void add(int data) {		
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

	public void addst(int data) {
		Node ob=new Node();
		ob.data=data;
		ob.next=head;
		head=ob;
		count=count+1;
		tail=ob.next;
		while(tail!=null) {
			tail=tail.next;
		}
	}

	public void insertAtMiddle(int data){
		Node newNode=new Node();
		newNode.data=data;
		Node temp = head;
		Node current = null;
		int count1=count/2;
		for(int i = 0; i < count1; i++) {
			current = temp;
			temp = temp.next;
		}
		current.next = newNode;
		newNode.next = temp;
		System.out.println(count1);
		count1++;
	}

	public Node insertAtPosition(int data,int data1){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			return newNode;
		}
		if (data1 == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node prev = null;
		Node current = head;
		int i = 0;
		while (current !=null && i < data1) {
			prev = current;
			current = current.next;
			i++;
		}
		newNode.next = prev.next;
		prev.next = newNode;
		return head;
	}

	public void delst() {
		Node ob=new Node();
		ob.next=head.next;
		head=ob.next;
		tail=head.next;
		count=count-1;
		while(tail!=null) {
			tail=tail.next;
		}
	}

	public void dellt() {
		Node newNode=new Node();
		Node temp = head;
		Node current = null;
		for(int i = 0; i < count-1; i++) {
			current = temp;
			temp = temp.next;
		}
		current.next = temp.next;
		newNode.next=null;
	}

	public void delAtMiddle(){
		Node newNode=new Node();
		Node temp = head;
		Node current = null;
		int count1=count/2;
		for(int i = 0; i < count1; i++) {
			current = temp;
			temp = temp.next;
		}
		current.next = temp.next;
		newNode.next=temp;
		count1++;
	}

	public Node deleteAtPosition(int data1){
		Node newNode = new Node();
		newNode = head;
		if (head == null) {
			return newNode;
		}
		if (data1 == 0) {
			newNode.next = head;
			newNode=null;;
			return head;
		}
		Node prev = null;
		Node current = head;
		int i = 0;
		while (current !=null && i < data1) {
			prev = current;
			current = current.next;
			i++;
		}
		newNode.next = prev.next;
		newNode=null;
		prev.next = newNode;
		return head;
	}

	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public Node concat(Node headA,Node headB) {	
		Node dummyNode = new Node(); 
		Node tail = dummyNode; 
		while(true)  
		{ 
			if(headA == null) 
			{ 
				tail.next = headB; 
				break; 
			} 
			if(headB == null) 
			{ 
				tail.next = headA; 
				break; 
			} 
			if(headA.data <= headB.data) 
			{ 
				tail.next = headA; 
				headA = headA.next; 
			}  
			else
			{ 
				tail.next = headB; 
				headB = headB.next; 
			} 
			tail = tail.next; 
		} 
		return dummyNode.next; 
	}

	public void sort() {
		Node current = head, index = null;  
		int temp;  
		if(head == null) {  
			return;  
		}  
		else {  
			while(current != null) {  
				//Node index will point to node next to current  
				index = current.next;  

				while(index != null) {  
					//If current node's data is greater than index's node data, swap the data between them  
					if(current.data > index.data) {  
						temp = current.data;  
						current.data = index.data;  
						index.data = temp;  
					}  
					index = index.next;  
				}  
				current = current.next;  
			}
		}
	}
	void common(Node head1, Node head2) 
	{ 
		Node t1 = head1; 
		while (t1 != null) 
		{ 
			if (isPresent(head2, t1.data)) {
				// push(t1.data); 
				System.out.println(t1.data);
			}
			t1 = t1.next; 
		}
	} 

	boolean isPresent (Node head, int data) 
	{ 
		Node t = head; 
		while (t != null) 
		{ 
			if (t.data == data) 
				return true; 
			t = t.next; 
		} 
		return false; 
	}
	void pairWiseSwap() 
    { 
        Node temp = head; 
        while (temp != null && temp.next != null) { 
            int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k; 
            temp = temp.next.next; 
        } 
    } 
}