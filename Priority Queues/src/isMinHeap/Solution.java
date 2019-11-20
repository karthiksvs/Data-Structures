package isMinHeap;

class Solution{
	public static boolean isMinHeap(double[] arr,int i){
		
		if(arr.length==0) {
			return false;
		}
		// if i is a leaf node, return true as every leaf node is a heap
				if (2*i + 2 > arr.length) {
					return true;
				}

				// if i is an internal node

				// recursively check if left child is heap
				boolean left = (arr[i] <= arr[2*i + 1]) && isMinHeap(arr, 2*i + 1);

				// recursively check if right child is heap (to avoid array out
				// of bound, we first check if right child exists or not)
				boolean right = (2*i + 2 == arr.length) ||
								(arr[i] <= arr[2*i + 2] && isMinHeap(arr, 2*i + 2));

				// return true if both left and right child are heap
				return left && right;
	}
}