package HashFunction;

import java.util.HashSet;
import java.util.Scanner;

public class Bonud_problem {
	public static void main(String[] args) {
		System.out.println("Enter the money");
		Scanner s =new Scanner(System.in);
		int money=s.nextInt();
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++) {
			int data=s.nextInt();
			a[i]=data;
		}
		for(int i=0;i<n;i++) {
			HashSet<Integer> h=new HashSet<Integer>();
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==money) {
					h.add(a[i]);
					h.add(a[j]);
				}
			}
			if(!h.isEmpty())
			System.out.println(h);
		}
	
}
}