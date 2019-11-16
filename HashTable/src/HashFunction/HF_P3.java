package HashFunction;

import java.util.HashSet;
import java.util.Scanner;

public class HF_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements of array");
		for(int i=0;i<n;i++) {
			int da=s.nextInt();
			arr[i]=da;
		}
		int ar[]=new int[n*n];
		int l=0;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if((arr[i]-arr[j])==3 || (arr[i]-arr[j])==-3) {
					ar[l]=arr[i];
					l=l+1;
					ar[l]=arr[j];
					l=l+1;
					count++;
				}
			}
		}
		System.out.println("The Number of pairs are:"+count);
		for(int i=0;i<l;i=i+2) {
			System.out.println("The sets are {"+ar[i]+","+ar[i+1]+"}");
		}
	}
}
