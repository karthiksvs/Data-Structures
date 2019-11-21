package Problems;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
	System.out.println("ENter a STring");
	Scanner s=new Scanner(System.in);
	String w=s.next();
	if(w.startsWith("bad",0)||w.startsWith("bad",1)) {
		System.out.println(true);
	}
		else
			System.out.println(false);	
		}

}
