package L2;

import java.util.Scanner;

public class P1 {
int rec(int n) {
	if(n==0) {
		return 0;
	}
	return n+rec(n-1);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("ENter a Number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	P1 p=new P1();
	System.out.println("Sum is:"+p.rec(n));
}
}
