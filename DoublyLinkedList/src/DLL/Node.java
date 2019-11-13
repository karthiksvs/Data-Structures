package DLL;

public class Node {
	int data;
	 Node next;
	 Node prev;
 public Node(int data, Node pre, Node nex) {
	 this.data=data;
	 this.prev=pre;
	 this.next=nex;
	}
 public Node(int v) {
     this.data = v;
     this.next = null;
     this.prev = null;
}

}