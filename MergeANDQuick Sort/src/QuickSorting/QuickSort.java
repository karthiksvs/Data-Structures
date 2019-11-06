package QuickSorting;

import java.util.Scanner;

public class QuickSort {
      private static void quickSort(int arr[], int lower, int last) {
            if (last <= lower)
                  return;
            int pivot = arr[lower];
            int first = lower;
            int stop = last;
 
            while (lower < last) {
                  while (arr[lower] <= pivot && lower < last) {
                        lower++;
                  }
                  while (arr[last] > pivot && lower <= last) {
                        last--;
                  }
                  if (lower < last) {
                        swap(arr, last, lower);
                  }
            }
            swap(arr, last, first);
            quickSort(arr, first, last - 1);
            quickSort(arr, last + 1, stop); 
      }
 
      public static void sort(int arr[]) {
            int size = arr.length;
            quickSort(arr, 0, size - 1);
      }
 
      private static void swap(int arr[], int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
      }
 
      public static void main(String[] args) {
    	  String arr=new String();
      	Scanner s2=new Scanner(System.in);
      	System.out.println("Enter the String of Array:");
      		String str=s2.next();	
      		str=str.toLowerCase();
      		arr=str;
      		int nameLenght = arr.length(); 
      		int array[]=new int[nameLenght];
      	    for(int i = 0; i < nameLenght ; i++){           
      	        char character = arr.charAt(i); 
      	        int ascii = (int) character; 
      	        array[i]=ascii;
      	    }
      	  QuickSort.sort(array);
            for (int i = 0; i < array.length; i++) {
                  System.out.println(array[i] + " "+(char)(array[i]));
            }
      }
}
