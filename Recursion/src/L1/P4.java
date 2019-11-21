package L1;

import java.util.Scanner;

public class P4 {
	public int countPairs(String str)
	{
		if(str.length() < 3)
			return 0;
		if(str.charAt(0) == str.charAt(2))
			return 1 + countPairs(str.substring(1));
		return countPairs(str.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter a STring");
		Scanner s=new Scanner(System.in);
		String w=s.next();
	P4 p=new P4();
	System.out.println("count"+p.countPairs(w));

	}

}
