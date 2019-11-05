package Combinesort;
class Solution{
	public int[] sortInsertion(int[] arr){
		// fill you code Here
		if(arr!=null) {
		for (int i=1; i < arr.length; i++)
		   {
		      int index = arr[i]; int j = i;
		      while (j > 0 && arr[j-1] > index)
		      {
		           arr[j] = arr[j-1];
		           j--;
		      }
		      arr[j] = index;
		}
		return arr;
		}
		return null;
	}
	public int[] sortSelection(int[] arr){
		// fill you code Here
		if(arr!=null) {
		  for (int i = 0; i < arr.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j < arr.length; j++)
		            if (arr[j] < arr[min]) 
		            	min = j;
		      int temp = arr[i];
		      arr[i] = arr[min];
		      arr[min] = temp;
		}
		  return arr;
		}
		return null;
	}
}