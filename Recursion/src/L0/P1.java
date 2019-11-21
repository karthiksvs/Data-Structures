package L0;

import java.util.Scanner;

public class P1 {
	int fun1(int x, int y)

	{

	  if(x == 0)

	    return y;

	  else

	    return fun1(x - 1,  x + y);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter data");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		P1 p=new P1();
		System.out.println(p.fun1(a,b));
			}

}
