package Queue;

public class op {
	static int a[]=new int[30];
	static int rear=0;
	static int front=0;
	static int count=0;
	public void enqueue(int data) {
		try {
				a[rear]=data;
				rear=rear+1;
				count=count+1;
		}catch(Exception e) {

		}
	}
	public void dequeue() {
		if(count < 0)
		{
			System.out.println( "Stack Underflow");
		}
		else
		{
			System.out.println("Element that is Dequeued : "+a[front]);
			a[front]=-1;
			front=front+1;
		}
	}
	public void dis() {
		for(int i=0;i<count;i++) {
			if(a[i]!=-1)
				System.out.println(a[i]);
		}
	}
	void isempty()
	{
		if(count < 0)
		{
			System.out.println( " Queue is empty");
		}
		else
		{
			System.out.println( "Queue is not empty");
		}
	}


}
