package Problems;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENter a STring");
Scanner s=new Scanner(System.in);
String w=s.next();
if(w.startsWith("red")||w.startsWith("blue")) {
	System.out.println(true);
}
	else
		System.out.println(false);	
	}

}
