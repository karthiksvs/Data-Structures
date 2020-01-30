package exam_27_01_2020;

import java.util.Scanner;
import java.util.Arrays; 
public class sample {
public static void main(String[] args) {
	System.out.println("Enter the number of elements to add");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Enter the number of elements to popped");
	int pop=s.nextInt();
	System.out.println("Enter the elements:");
	int arr1[]=new int[n];
	for(int i=0;i<n;i++) {
		int data=s.nextInt();
		arr1[i]=data;
	}
	Arrays.sort(arr1); 
    int sum=0;
    System.out.printf("Modified arr[] : %s", Arrays.toString(arr1)); 
    for(int i=1;i<=pop;i++) {
    	sum=sum+arr1[n-i];
    }
    System.out.println("The sum of max elements in stack and queue is:"+sum);
}
}
