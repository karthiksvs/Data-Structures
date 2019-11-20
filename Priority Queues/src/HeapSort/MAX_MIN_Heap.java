package HeapSort;

import java.util.Arrays;
import java.util.Scanner;

public class MAX_MIN_Heap {

	public int KthSmallest(int[] arr, int size, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

	public boolean isMinHeap(int[] arr, int size) {
		int lchild, rchild;
		for (int parent = 0; parent < (size / 2 + 1); parent++) 
		{
			lchild = parent * 2 + 1;
			rchild = parent * 2 + 2;
			if (((lchild < size) && (arr[parent] > arr[lchild])) || ((rchild < size) && (arr[parent] >
			arr[rchild])))
				return false;
		}
		return true;
	}
	
	public boolean isMaxHeap(int[] arr, int size) {
		int lchild, rchild;
		for (int parent = 0; parent < (size / 2 + 1); parent++) 
		{
			lchild = parent * 2 + 1;
			rchild = lchild + 1;
			if (((lchild < size) && (arr[parent] < arr[lchild])) || ((rchild < size) && (arr[parent] <
					arr[rchild])))
				return false;
		}
		return true;
	}

	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int n = s.nextInt();
		int arr[] = new int[n]; 
		System.out.println("Enter the elements of Array:");
		for(int i=0;i<n;i++) 
		{
			int a=s.nextInt();
			arr[i]=a;
		}
		MAX_MIN_Heap mn=new MAX_MIN_Heap();
		System.out.println("Enter 1st position");
		int re=s.nextInt();
		System.out.println(mn.KthSmallest(arr, n, re));
		System.out.println("Minimum:");
		System.out.println(mn.isMinHeap(arr, n));
		System.out.println("Maximum:");
		System.out.println(mn.isMaxHeap(arr, n));

	}
}