package HashFunction;
import java.util.*; 

public class HS {
		public static void main(String[] args) 
		{ 
			HashSet<String> h = new HashSet<String>(); 
			h.add("India"); 
			h.add("Australia"); 
			h.add("South Africa"); 
			h.add("India"); // adding duplicate elements 
			System.out.println(h); 
			System.out.println("\nHashSet contains India "+ h.contains("India")); 
			h.remove("Australia"); 
			System.out.println("\nList after removing Australia:" + h); 
			System.out.println("\nIterating over list:"); 
			Iterator<String> i = h.iterator(); 
			while (i.hasNext()) 
				System.out.println(i.next()); 
		} 
	} 