package HashFunction;

import java.io.FileInputStream;
import java.util.HashMap;

public class HF_P1 {
	public static void main(String[] args) {
	HashMap< String,Integer> hm = new HashMap< String,Integer>(); 
	FileInputStream fin;
	try {
		fin = new FileInputStream("sample.txt");
		int i=0;  String s="";
	      String arr[]=new String[100];
	      int l=0;
	      int co=0;
	    while((i=fin.read())!=-1){  
	    	s=s+(char)i;
	    	if((char)i==' ') {
	    		arr[l]=s;
  	    	l=l+1;
  	    	 s="";
  	    	 co=co+1;
	    	}     
    	}
	    for(int j=0;j<co;j++) {
	    	int cou=0;
		    String n=arr[j];
	    	for(int k=j;k<co;k++) {
	    		String m=arr[k];
	    		if(m.equals(n)) {
	    			cou=cou+1;
	    		}
	    }
	    	if(!hm.containsKey(n)) {
	    	hm.put(n,cou);
	    	}
	    }
	    System.out.println(hm);
	} catch (Exception e1) {
		e1.printStackTrace();
	}  }
}
