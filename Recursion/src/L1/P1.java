package L1;

import java.util.Scanner;

public class P1 {
	static int count=0;
	int rec(String w) {
		if(w.length() == 0)
			return 0;
		if(w.charAt(0) == 'x')
			return 1 + rec(w.substring(1));
		return rec(w.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("ENter a STring");
	Scanner s=new Scanner(System.in);
	String w=s.next();
P1 p=new P1();
System.out.println("count"+p.rec(w));
	}
}
