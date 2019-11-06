package MergeSort;

import java.util.Scanner;
public class MergeSort {
    private static Scanner s2;

	public static void mergeSrt(int[] arr, int[] tempArray, int lowerIndex, int upperIndex) {
          if (lowerIndex >= upperIndex) {
                return;
          }
          int middleIndex = (lowerIndex + upperIndex) / 2;
          mergeSrt(arr, tempArray, lowerIndex, middleIndex);
          mergeSrt(arr, tempArray, middleIndex + 1, upperIndex);
          int low = lowerIndex;
          int lowerStop = middleIndex;
          int up = middleIndex + 1;
          int upperStop = upperIndex;
          int count = lowerIndex;
          while (low <= lowerStop && up <= upperStop) {
                if (arr[low] < arr[up]) {
                      tempArray[count++] = arr[low++];
                } else {
                      tempArray[count++] = arr[up++];
                }
          }
          while (low <= lowerStop) {
                tempArray[count++] = arr[low++];
          }
          while (up <= upperStop) {
                tempArray[count++] = arr[up++];
          }
          for (int i = lowerIndex; i <= upperIndex; i++) {
                arr[i] = tempArray[i];
          }
    }

    public static void sort(int[] arr) {
          int size = arr.length;
          int[] tempArray = new int[size];
          mergeSrt(arr, tempArray, 0, size - 1);
    }

    public static void main(String[] args) {
    	String arr=new String();
    	s2 = new Scanner(System.in);
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
          MergeSort.sort(array);
          for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " "+(char)(array[i]));
          }
}
}