package HashFunction;

import java.util.Hashtable;
import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a String:");
Scanner s=new Scanner(System.in);
String str=s.next();
String arr=new String();
	str=str.toLowerCase();
	arr=str;
	int nameLenght = arr.length(); 
	int array[]=new int[nameLenght];
    for(int i = 0; i < nameLenght ; i++){           
        char character = arr.charAt(i); 
        int ascii = (int) character; 
        array[i]=ascii;
    }
    Hashtable<Character,Integer> h=new Hashtable<Character,Integer>();
    int m=5;
    for(int i=0;i<nameLenght;i++) {
    	int a=array[i]/5;
    	if(!h.containsKey(((char)array[i]))){
    		char ss=(char)array[i];
    		h.put(ss,a);
    	}
    }
    System.out.println(h);
	}

}
