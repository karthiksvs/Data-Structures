package Steque;
import java.util.Scanner;
public class ListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		StaQue ob=new StaQue();
		int c=0;
		System.out.println("Stack Operations");
		while(c!=8) {
			int b=0;
			System.out.println("1.Push data to Stack\n2.Pop element from Stack \n3.Display Stack\n4.Stack Status\n5.Enqueue operation\n 6.Exit\n");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter data size to add");
			int a=sc.nextInt();
			for(int i=0;i<a+b;i++) {
				
				System.out.println("enter data");
				int data=sc.nextInt();
				ob.push(data);
			}
			b=b+a;
			break;
		case 2:
			ob.pop();
			break;
		case 3:
			ob.display();
			break;
		case 4:
			ob.isempty();
			break;
		case 5:
			System.out.println("Enter data size to add");
			a=sc.nextInt();
			for(int i=0;i<a+b;i++) {
				System.out.println("enter data");
				int data=sc.nextInt();
				ob.Enqueue(data);
			}
			b=b+a;
			break;
		case 6:
			c=8;
			System.out.println("Stack Queue liked list completed");
			System.exit(0);
			break;
		}
		}	
	}
}