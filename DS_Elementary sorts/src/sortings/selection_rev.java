package sortings;

import java.util.Scanner;

class sorting{
public void InsertionSort(String ar){
	int nameLenght = ar.length(); 
	int arr[]=new int[30];
    for(int i = 0; i < nameLenght ; i++){           
        char character = ar.charAt(i); 
        int ascii = (int) character; 
        arr[i]=ascii;
}
    sorting s=new sorting();
    s.selectionSort(arr);
}
void selectionSort(int[] ar)
{
	int n=ar.length;
	for(int i=0;i<(ar.length/2)+1;i++) {
		int tem=ar[i];
		ar[i]=ar[n-1-i];
		ar[n-1-i]=tem;
	}
	  for (int i = 0; i < ar.length-1; i++)
	   {
	      int min = i;
	      for (int j = i+1; j < ar.length; j++)
	            if (ar[j] < ar[min]) 
	            	min = j;
	      int temp = ar[i];
	      ar[i] = ar[min];
	      ar[min] = temp;
	}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0)
				System.out.println(ar[i]+"  "+(char)(ar[i]));
}   }
}

public class selection_rev {

	public static void main(String[] args) {
			String arr=new String();
			sorting s=new sorting();
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the Elemnts of Array:");
				String str=s2.next();	
				arr=str;
			s.InsertionSort(arr);


	}

}
