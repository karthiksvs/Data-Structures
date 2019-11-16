package HashFunction;

import java.util.HashSet;

public class sample {
	public int hashCode() {
		return 17;
		}
	public static void main(String args[]) 
    { 
	HashSet<Integer> hm = new HashSet<Integer>(); 
	sample s=new sample();
    int a=s.hashCode();
    hm.add(a);
    System.out.println(hm);
}
}
