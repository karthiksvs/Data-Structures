package M1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Triplet {
		boolean find3Numbers(int A[], int arr_size, int sum) 
		{ 
			for (int i = 0; i < arr_size - 2; i++) { 
				for (int j = i + 1; j < arr_size - 1; j++) { 
					for (int k = j + 1; k < arr_size; k++) { 
						if (A[i] + A[j] + A[k] == sum) { 
							System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]); 
							return true; 
						} 
					} 
				} 
			}
			return false; 
		} 
		public static void main(String[] args) 
		{ 
			int arr[] = new int[50];
			  int i=0;
			       int count=0;
			    String r="";
			try
		    {
			   File fin=new File("sample 1.txt");  
			    BufferedReader b = new BufferedReader(new FileReader(fin));
			    while ((r = b.readLine()) != null) {
	                i=Integer.parseInt(r);
	                arr[count]=i;
	               // System.out.println(arr[count]);
	                count++;
			    }
			        Triplet triplet = new Triplet(); 
	    			int sum = 0; 
	    			int arr_size = count; 
	    			triplet.find3Numbers(arr, arr_size, sum); 
b.close();
	            
		    }catch(Exception e) {
		    }
					} 
	} 

