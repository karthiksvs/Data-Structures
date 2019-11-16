package HashFunction;
import java.util.Hashtable;
public class sample2 {
	 static Hashtable<Integer, String> hm = new Hashtable<Integer, String>(); 
    void put(int value,String key) {
    	 hm.put(value, key); 
			}
    void remove(String key) {
    	hm.remove(key);
    }
    void display() {
    	System.out.println(hm);
    }
    String get(int value) {
    	String n=hm.get(value);
    	return n;
    }
		public static void main(String args[]) 
	    { 
			sample2 s=new sample2();
			 s.put(1, "Geeks"); 
		     s.put(12, "forGeeks"); 
		     s.put(15, "A computer"); 
		     s.put(3, "Portal"); 
		     s.remove("Geeks");
		     System.out.println(s.get(15));
		     s.display();
		}
	}