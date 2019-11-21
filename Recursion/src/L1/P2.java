package L1;

import java.util.Scanner;

public class P2 {
	public int strCount(String str, String sub)
	{
		int sLen = sub.length();
		if(str.length() < sLen)
			return 0;
		if(str.substring(0, sLen).equals(sub))
			return 1 + strCount(str.substring(sLen), sub);
		return strCount(str.substring(1), sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter a STring");
		Scanner s=new Scanner(System.in);
		String w=s.next();
		String x=s.next();
	P2 p=new P2();
	System.out.println("count"+p.strCount(w,x));

	}

}
