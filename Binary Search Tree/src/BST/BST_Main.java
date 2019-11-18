package BST;

import java.util.Scanner;

public class BST_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b=new BST();
		Node root=null;
		int c=0;
		int cou=0;
		Scanner s=new Scanner(System.in);
		while(c!=9) {
			cou=b.findHeight(root);
			int sum[]=new int[cou];  
			System.out.println("1.Insert into BST\n2.Delete a element in BST\n3.Inorder BST\n4.Preorder BST\n5.Postorder BST\n6.Search\n7.Size of BST\n"
					+ "8.Find Height of BST\n9.Min Value\n10.Max value\n11.Sum of levels\n12.Is a BST or not\n13.Exit\n");
			System.out.println("Choose your option");
			int op=s.nextInt();
			switch(op){
			case 1:
				System.out.println("Enter the number of elements you want to insert:");
				int n=s.nextInt();
				int ar[]=new int[n];
				System.out.println("Enter data:");
				for(int i=0;i<n;i++) {
					int data=s.nextInt();
					ar[i]=data;
				}
				root=b.insert(root, ar[0]);
				for(int i=1;i<n;i++) {
					root=b.insert(root, ar[i]);
				}
				break;
			case 2:
				System.out.println("Enter the element you want to delete:");
				int da=s.nextInt();
				b.deleteRec(root,da);
				System.out.println("Deleted Node");
				break;
			case 3:
				b.inorder(root);
				break;
			case 4:
				b.preorder(root);
				break;
			case 5:
				b.postorder(root);
				break;
			case 6:
				System.out.println("Enter the element you want to delete:");
				int key=s.nextInt();
				b.search(root,key);
				System.out.println("Searhed element found");
				break;
			case 7:
				System.out.println("Size of BST is:"+b.size(root));
				break;
			case 8:
				int a=b.findHeight(root);
				System.out.println("Height of BST is:"+(a));
				break;
			case 9:
				System.out.println("Minimum value is:"+b.minValue(root));
				break;
			case 10:
				System.out.println("Maximum value is:"+b.maxValue(root));
				break;
			case 11:
				b.calculateLevelSum(root,0, sum);
				for (int i = 0; i < cou; i++)  
					System.out.println(sum[i]+ " " );   
				break;
			case 12:
				if(b.isBST(root))
					System.out.println("It is a BST ");
				else
					System.out.println("It is a Not BST ");
				break;
			case 13:
				System.out.println("Binary Search tree operations completed");
				c=9;
				System.exit(0);
				break;	
			}
		}
	}
}
