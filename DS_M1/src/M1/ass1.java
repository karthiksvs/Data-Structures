package M1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try
		    {
			   File fin=new File("sample.txt");  
			    int i=0;
			    int arr[] = new int[50];
			    int arr1[] = new int[50];
			       int count=0;
			    String r="";
			    BufferedReader b = new BufferedReader(new FileReader(fin));
			    while ((r = b.readLine()) != null) {
	                i=Integer.parseInt(r);
	                arr[count]=i;
	               // System.out.println(arr[count]);
	                count++;
	            }
			    int l=0;
			    
			    for(int j=0;j<count;j++) {
			    	for(int k=j+1;k<count;k++) {
			    		int z=arr[k];
			    		int x=arr[j];
			    		if(z==x) {
			    			arr1[l]=arr[k];
			    			System.out.println(arr1[l]+" is repeating");
			    			l++;
			    			break;
			    		}
			    	}
			    	}
			    b.close();
System.out.println("Number of pairs are"+"  "+(l));
System.out.println("\n\n");
System.out.println("Method 2");
int arr2[]=new int[count];
for(int k=0;k<count;k++) {
	arr2[k]=arr[k];
}
Arrays.sort(arr2);
for(int k=0;k<count-1;k++) {
int z=arr2[k];
int x=arr2[k+1];
if(z==x) {
	int y=arr2[k+2];	
		if(x!=y) {
			System.out.println(arr2[k]+" is repeating");
		}
	}
}
System.out.println("Number of pairs are"+"   "+(l));

    }
		    catch (IOException e)
		    {
		      System.out.println("IOException : " + e);
		    }
		 }
}
