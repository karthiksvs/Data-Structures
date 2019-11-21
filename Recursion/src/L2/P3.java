package L2;

public class P3 {
	public static int findMinRec(int A[], int n) 
    { 
      if(n == 0) 
        return 0; 
          
        return A[n-1]+findMinRec(A, n-1); 
    } 
    public static void main(String args[]) 
    { 
        int A[] = {1, 4, 45, 6, 50, 10, 2}; 
        int n = A.length; 
        System.out.println(findMinRec(A, n)); 
    } 
}
