package L1;

import java.util.Scanner;

public class P3 {
	public int count11(String str)
	{
		if(str.length() < 2)
			return 0;
		if(str.substring(0, 2).equals("11"))
			return 1 + count11(str.substring(2));
		return count11(str.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter a STring");
		Scanner s=new Scanner(System.in);
		String w=s.next();
	P3 p=new P3();
	System.out.println("count"+p.count11(w));

	}

}
