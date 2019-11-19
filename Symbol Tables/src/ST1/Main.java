package ST1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTree b=new StringTree();
		Node root=null;
		int c=0;
		int cou=0;
		Scanner s=new Scanner(System.in);
		while(c!=9) {
			System.out.println("1.Add Element\n2.Find element\n3.Frequency\n4.Display\n5.Exit\n");
			System.out.println("Choose your option");
			int op=s.nextInt();
			switch(op){
			case 1:
				System.out.println("Enter the number of elements you want to insert:");
				int n=s.nextInt();
				String ar[]=new String[n];
				System.out.println("Enter data:");
				for(int i=0;i<n;i++) {
					String data=s.next();
					ar[i]=data;
				}
				for(int i=0;i<n;i++) {
					b.add(ar[i]);
				}
				break;
			case 2:
				System.out.println("Enter data:");
				String data1=s.next();
				b.find(data1);
				break;
			case 3:
				System.out.println("Enter data:");
				String data=s.next();
				System.out.println("The frquency of element is"+b.frequency(data));
			break;
			case 4:
				b.print();
			break;
			case 5:
				System.out.println("Symbol table operations completed");
				c=9;
				System.exit(0);
				break;	
			}
		}
	}

}
