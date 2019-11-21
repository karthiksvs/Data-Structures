package Problems;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENter a STring");
Scanner s=new Scanner(System.in);
String w=s.next();
int a=w.length()/2;
System.out.println(w.substring(a-1,a+1));
	}
}
