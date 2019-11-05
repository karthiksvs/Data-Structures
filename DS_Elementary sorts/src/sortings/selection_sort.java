package sortings;

import java.util.Scanner;

class sort{
public void selectionSort(String ar){
	int nameLenght = ar.length(); 
	int arr[]=new int[30];
    for(int i = 0; i < nameLenght ; i++){           
        char character = ar.charAt(i); 
        int ascii = (int) character; 
        arr[i]=ascii;
}
    sort s=new sort();
    s.selectionSort1(arr);
}
void selectionSort1(int[] ar){
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
}
	   }
}
class selection_sort {
public static void main(String args[]) {
	String arr=new String();
	sort s=new sort();
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter the Elemnts of Array:");
		String str=s2.next();
		str=str.toLowerCase();
		arr=str;
	s.selectionSort(arr);

}
}
