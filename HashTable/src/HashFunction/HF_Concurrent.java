package HashFunction;
import java.util.concurrent.*; 

public class HF_Concurrent {
		public static void main(String[] args) 
		{ 
			ConcurrentHashMap<Integer, String> m = 
					new ConcurrentHashMap<Integer, String>(); 
			m.put(100, "Hello"); 
			m.put(101, "World"); 
			m.put(102, "Welcome"); 
			System.out.println("ConcurentHashMap: " + m); 
			m.putIfAbsent(101, "Hello"); 
			System.out.println("\nConcurentHashMap after checking absent: " + m); 
			m.remove(101, "Geeks"); 
			System.out.println("\nConcurentHashMap after removing: " + m); 
			m.replace(100, "Hello", "Hi"); 
			System.out.println("\nConcurentHashMap after replacing: " + m); 
		} 
	} 
