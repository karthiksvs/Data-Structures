package Ass1;
class Solution{
	public static int[] quickSort(int[] arr){
		// fill you code Here
		int size = arr.length;
		quickSort(arr, 0, size - 1);
		return arr;
	}
	public static void quickSort(int arr[],int lower, int upper) {

		if (upper <= lower)
			return;
		int pivot = arr[lower];
		int start = lower;
		int stop = upper;

		while (lower < upper) {
			while (arr[lower] <= pivot && lower < upper) {
				lower++;
			}
			while (arr[upper] > pivot && lower <= upper) {
				upper--;
			}
			if (lower < upper) {
				swap(arr, upper, lower);
			}
		}
		swap(arr, upper, start); 
		quickSort(arr, start, upper - 1);
		quickSort(arr, upper + 1, stop); 
	}
	private static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}