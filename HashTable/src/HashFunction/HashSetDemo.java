package HashFunction;
import java.util.*;

public class HashSetDemo {
    public static void main(String a[]){

        HashSet<String> hs = new HashSet<String>();

        //add elements to HashSet

        hs.add("first");

        hs.add("second");

        hs.add("third");

        Iterator<String> itr=hs.iterator();  

        while(itr.hasNext()){  

        System.out.println(itr.next());  

        }  

        System.out.println("Is HashSet empty? "+hs.isEmpty());

        hs.remove("third");

        System.out.println(hs);

        System.out.println("Size of the HashSet: "+hs.size());

        System.out.println("Does HashSet contains first element? "+hs.contains("first"));

    }
    }