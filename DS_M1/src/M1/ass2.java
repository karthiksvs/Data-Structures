package M1;

import java.util.Arrays;

public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {1,5,6,8,9};
int ar1[]= {2,5,5,8,9};
int ar2[]=new int[ar.length];
int k=0;
for(int i=0;i<ar.length;i++) {
	for(int j=0;j<ar1.length;j++) {
		if(ar[i]==ar1[j]) {
			ar2[k]=ar[i];
			k++;
		//	System.out.println(ar[i]+" ");
		}
	}
}
int arr2[]=new int[k];
for(int k1=0;k1<k;k1++) {
	arr2[k1]=ar2[k1];
}
Arrays.sort(arr2);
//System.out.println("After");
for(int i=0;i<k;i++) {
	if(i!=k-1) {
	int z=arr2[i];
	int x=arr2[i+1];
	if(z!=x) {
				System.out.println(arr2[i]);
			}
		}
	else {
		int z=arr2[i];
		int x=arr2[i-1];
		if(z!=x) {
					System.out.println(arr2[i]);
				}
		
	}
}

	}

}
