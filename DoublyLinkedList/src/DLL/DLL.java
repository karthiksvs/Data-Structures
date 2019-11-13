package DLL;

public class DLL {

	static int size;
	Node head;
	Node tail;

	public void add(int data) {
		Node newNode = new Node(data); 
		if (size == 0) {
			tail = head = newNode;
		} 
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	public void addHead(int data) {
		Node newNode = new Node(data, null, null);
		if (size == 0) {
			tail = head = newNode;
		} 
		else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void InsertEnd(int data) {
		Node new_node = new Node(data); 
		Node last = head; 
		new_node.next = null; 
		if (head == null) { 
			new_node.prev = null; 
			head = new_node; 
		} 
		while (last.next != null) 
			last = last.next; 
		tail.next = new_node; 
		new_node.prev = tail; 
		tail=new_node;
		size++;
	}

	public int removeHead() {
		if (isEmpty())
			throw new IllegalStateException("EmptyListException");
		int data = head.data;
		head = head.next;

		if (head == null)
			tail = null;
		else
			head.prev = null;

		size--;
		return data;
	}

	public int removeTail() {
		if (isEmpty())
			throw new IllegalStateException("EmptyListException");
		int data = tail.data;
		tail=tail.prev;
		if (tail == null)
			head = null;
		else
			tail.next = null;
		size--;
		return data;
	}

	public void sortList() {  
		Node current = null, index = null;  
		int temp; 
		if(head == null) {  
			return;  
		}  
		else {  
			for(current = head; current.next != null; current = current.next) {  
				for(index = current.next; index != null; index = index.next) {  
					if(current.data > index.data) {  
						temp = current.data;  
						current.data = index.data;  
						index.data = temp;  
					}  
				}  
			}  
		}  
	}  

	void isempty()
	{
		if(size < 0){
			System.out.println( " Doubly Linked List is empty");
		}
		else{
			System.out.println( " Doubly Linked List is not empty");
		}
	}

	boolean isEmpty()
	{
		if(size < 0){
			return false;
		}
		else{
			return false;
		}
	}

	public boolean removeNode(int key) {
		Node curr = head;
		if (curr == null)  
			return false;
		if (curr.data == key) {
			head = head.next;
			size--;
			if (head != null)
				head.prev = null;
			else
				tail = null; 
			return true;
		}
		while (curr.next != null) {
			if (curr.next.data == key) {
				curr.next = curr.next.next;
				if (curr.next == null)  
					tail = curr;
				else
					curr.next = curr;
				size--;
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public void reverseList() {
		Node curr = head;
		Node tempNode;
		while (curr != null) {
			tempNode = curr.next;
			curr.next = curr.prev;
			curr.prev = tempNode;

			if (curr.prev == null) {
				tail = head;
				head = curr;
				return;
			}
			curr = curr.prev;
		}
		return;
	}

	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}