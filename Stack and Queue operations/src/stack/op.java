package stack;
class op{
	static int a[]=new int[30];
	static int count=0;
	int m=0;
	// ADD
	public void push(int data) {
		try {
				a[m]=data;
				m=m+1;
				count=count+1;
		}catch(Exception e) {

		}
	}
	public void pop() {
		if(count < 0)
		{
			System.out.println( "Stack Underflow");
		}
		else
		{
			System.out.println("Element that is Popped : "+a[count-1]);
			a[count]=-1;
			count=count-1;
		}
	}
	public void dis() {
		for(int i=0;i<count;i++) {
			System.out.println(a[i]);
		}
	}
	void isempty()
	{
		if(count < 0)
		{
			System.out.println( " Stack is empty");
		}
		else
		{
			System.out.println( "Stack is not empty");
		}
	}

}
