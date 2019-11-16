package HashFunction;

import java.util.LinkedHashMap;

public class HF_With_String {
	public static void main(String a[])  
    {  
        LinkedHashMap<String, String> lhm =  
                       new LinkedHashMap<String, String>();  
        lhm.put("one", "Welcome");  
        lhm.put("two", "to"); 
        lhm.put("three","my");
        lhm.put("four", "World");  
        System.out.println(lhm);  
        System.out.println("Getting value for key 'one': "  + lhm.get("one"));  
        System.out.println("Size of the map: " + lhm.size());  
        System.out.println("Is map empty? " + lhm.isEmpty());  
        System.out.println("Contains key 'two'? "+ lhm.containsKey("two"));  
        System.out.println("Contains value to :"+ lhm.containsValue("to"));  
        System.out.println("delete element 'one': " +lhm.remove("one"));  
        System.out.println(lhm);  
    }  
}