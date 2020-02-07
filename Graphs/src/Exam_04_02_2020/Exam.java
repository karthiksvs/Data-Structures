package Exam_04_02_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
public static void main(String args[]) {
	System.out.println("Enter the number");
Scanner s= new Scanner(System.in);
String num1=s.nextLine();
System.out.println("Enter the Second number");
String num2=s.nextLine();
int n=num1.length();
int m=num2.length();
int ar[]=new int[n];
int ar1[]=new int[m];
for(int i=0;i<n;i++) {
	ar[i]=num1.charAt(i);
}
for(int i=0;i<n;i++) {
	ar1[i]=num2.charAt(i);
}
Arrays.sort(ar1);
int arr[]=new int[n];
if(n==m) {
	for(int i=0;i<n;i++) {
		arr[i]=ar[i]-ar1[i];
	}
}
else {
	System.out.println("Cannot apply subraction");
}
for(int i=0;i<n;i++) {
	System.out.print(arr[i]);
}
}
}
