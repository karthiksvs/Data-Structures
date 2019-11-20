package Priority_with_heap;
import java.util.Arrays;
import java.util.Scanner;
 
class PriorityQueue {
	    int[] arr;
	    int size;
	    int count;
	    PriorityQueue(int size){
	        this.size = size;
	        arr = new int[size];
	        count = 0;
	    }
	    
	    void insert(int value){
	        if(count == size){
	            System.out.println("Cannot insert the key");
	            return;
	        }
	        arr[count++] = value;
	        heapifyUpwards(count);
	    }
	    
	    void heapifyUpwards(int x){
	        if(x<=0)
	            return;
	        int par = (x-1)/2;
	        int temp;
	        if(arr[x-1] < arr[par]){
	            temp = arr[par];
	            arr[par] = arr[x-1];
	            arr[x-1] = temp;
	            heapifyUpwards(par+1);
	        }
	    }
	    
	    int extractMin(){
	       int rvalue = arr[0];
	       arr[0] = Integer.MAX_VALUE;
	       heapifyDownwards(0);
	       return rvalue;
	    }
	    
	    void heapifyDownwards(int index){
	        if(index >=arr.length)
	            return;
	        int temp;
	        int min = index;
	        int left,right;
	        left = 2*index;
	        right = left+1;
	        if(left<arr.length && arr[index] > arr[left]){
	            min =left;
	        }
	        if(right <arr.length && arr[min] > arr[right]){
	            min = right;
	        }
	        if(min!=index) {
	            temp = arr[min];
	            arr[min] = arr[index];
	            arr[index] = temp;
	            heapifyDownwards(min);
	        }
	    }
	    
	    static void heapSort(int[] array){
	        PriorityQueue object = new PriorityQueue(array.length);
	        int i;
	        for(i=0; i<array.length; i++){
	            object.insert(array[i]);
	        }
	        for(i=0; i<array.length; i++){
	            array[i] = object.extractMin();
	        }
	    }
	}

	public class PriorityQueueTest {
	    public static void main(String[] args) {
	    	
	        int n;
	        System.out.println("Enter the number of elements in the array");
	        Scanner s=new Scanner(System.in);
	            n =s.nextInt(); 
	        System.out.println("Enter array elements");
	        int[] array = new int[n];
	        int i;
	        for(i=0; i<array.length; i++){
	        	int da=s.nextInt();
	                array[i] = da;
	            }
	        System.out.println("The initial array is");
	        System.out.println(Arrays.toString(array));
	        PriorityQueue.heapSort(array);
	        System.out.println("The sorted array is");
	        System.out.println(Arrays.toString(array));
	    }
	}
