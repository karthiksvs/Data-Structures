package Self;

public class s1 {
	public static void main(String[] args)
	  {
	        StringBuffer s1=new StringBuffer("Buggy");
	        
	               test(s1);
	        
	        System.out.println(s1);
	        
	  } 
	 
	 private static void test(StringBuffer s){
	  s.append("Bread");
	 }

}
