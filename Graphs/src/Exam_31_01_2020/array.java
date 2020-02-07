package Exam_31_01_2020;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			int data=s.nextInt();
			arr[i]=data;
		}
		int m=arr.length;
		System.out.println("Element that repeating only once is :"+findSingle(arr,m));
	}
	static int findSingle(int ar[], int ar_size) 
	{ 
		// Do XOR of all elements and return 
		int res = ar[0]; 
		for (int i = 1; i < ar_size; i++) 
			res = res ^ ar[i]; 
		return res; 
	} 
}
