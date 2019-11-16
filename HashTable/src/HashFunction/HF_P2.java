package HashFunction;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HF_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h = new HashMap<String,Integer>(); 
		  	try {
				BufferedReader in = new BufferedReader(new FileReader("sample1.txt"));
			    String s="";
			      String arr[]=new String[100];
			      String tr[]=new String[100];
			      String pr[]=new String[100];
			      int l=0;
			      while((s = in.readLine()) != null){
			          String[] var = s.split("-");
			          arr[l]=(var[0]);
			          tr[l]=var[1];
			          pr[l]=var[2];
			          l=l+1;
			         }
			      for(int i=0;i<l;i++) {
			    	  int t=Integer.parseInt(tr[i]);
			    	  int p=Integer.parseInt(pr[i]);
			    	  int total=t*p;
			    	  if(h.containsKey(arr[i])) {
			    		  int to=h.get(arr[i]);
			    		  h.put(arr[i],to+total);
			    	  }
			    	  else {
			    		  h.put(arr[i],total);
			    	  }
			      }
			      System.out.println(h);
			}catch (Exception e1) {
				e1.printStackTrace();
			}  
}
}
