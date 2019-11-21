package Problems;

import java.util.Scanner;

public class L1_p1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		System.out.println("ENter size ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String ar[]=new String[n];
		for(int i=0;i<n;i++) {			
			String w=s.next();
			ar[i]=w;
		}
	for(int i=0;i<n;i++) {
		char c[]=ar[i].toCharArray();
		int k=0;
		System.out.println();
		int j=c.length;
		while(k!=j) {
			if((c[k]=='A' && c[k+1]=='m')||(c[k]=='N' && c[k+1]=='a')||(c[k]=='l' && c[k+1]=='e')) {
				System.out.print("["+c[k]+c[k+1]+"]");
			k=k+2;
			}
		else if(c[k]=='I') {
			System.out.print("["+c[k]+"]");	
			k++;
		}
		else if((c[k]=='c'&&c[k+1]=='r'&&c[k+2]=='o')||(c[k]=='a'&&c[k+1]=='b'&&c[k+2]=='c')) {
			System.out.print("["+c[k]+c[k+1]+c[k+2]+"]");
			k=k+3;
		}
			else {
				System.out.print(c[k]);		
				k=k+1;
			}
		}
//			
//		if(ar[i].contains('I')||ar[i].contains('Am')||ar[i].contains('cro')||ar[i].contains('Na')||ar[i].contains('le')||ar[i].contains('abc'))
	}
	}

}
