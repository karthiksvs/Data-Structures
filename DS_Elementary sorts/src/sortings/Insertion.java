package sortings;

import java.util.Scanner;

class sorted{
public void InsertionSort(String ar){
	int nameLenght = ar.length(); 
	int arr[]=new int[30];
    for(int i = 0; i < nameLenght ; i++){           
        char character = ar.charAt(i); 
        int ascii = (int) character; 
        arr[i]=ascii;
}
    sorted s=new sorted();
    s.insertionSort(arr);
}
void insertionSort(int[] ar)
{
   for (int i=1; i < ar.length; i++)
   {
      int index = ar[i]; int j = i;
      while (j > 0 && ar[j-1] > index)
      {
           ar[j] = ar[j-1];
           j--;
      }
      ar[j] = index;
}
	for(int i=0;i<ar.length;i++) {
		if(ar[i]!=0)
			System.out.println(ar[i]+"  "+(char)(ar[i]));
}
   }
}
public class Insertion {
	public static void main(String args[]) {
	String arr=new String();
	sorted s=new sorted();
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter the Elemnts of Array:");
		String str=s2.next();	
		str=str.toLowerCase();
		arr=str;
	s.InsertionSort(arr);

}
}
//insertion sort is better when all elements are identical.
