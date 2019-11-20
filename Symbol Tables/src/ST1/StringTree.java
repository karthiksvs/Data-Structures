package ST1;

public class StringTree {
	      Node root = null;
	 	 
	      // Other Methods.
	 
	      public void print() {
	            print(root);
	      }
	 
	      public void print(Node curr) /* pre order */
	      {
	            if (curr != null) {
	            	  System.out.print(" value is ::" + curr.value);
	                  System.out.println(" count is :: " + curr.count);
	                  print(curr.lChild);
	                  print(curr.rChild);
	            	}
	      }
	 
	      public void add(String value) {
	            root = add(value, root);
	      }
	      public void delete(String value) {
	            root = deleteRec(value, root);
	      }
	      Node add(String value, Node curr) {
	            int compare;
	            if (curr == null) {
	                  curr = new Node();
	                  curr.value = value;
	                  curr.lChild = curr.rChild = null;
	                  curr.count = 1;
	            } else {
	                  compare = curr.value.compareTo(value);
	                  if (compare == 0)
	                        curr.count++;
	                  else if (compare == 1)
	                        curr.lChild = add(value, curr.lChild);
	                  else
	                        curr.rChild = add(value, curr.rChild);
	            }
	            return curr;
	      }
	 
	      public Node deleteRec(String value,Node curr) 
	  	{ 
	    	  int compare;
	            if (curr == null) {
	                  return null;
	            } 
	            else {
	                  compare = curr.value.compareTo(value);
	                  if (compare == 0)
	                        curr.count--;
	                  else if (compare == 1)
	                        curr.lChild = deleteRec(value, curr.lChild);
	                  else
	                        curr.rChild = deleteRec(value, curr.rChild);
	            }
	            return curr;
	      } 
	      
	      boolean find(String value) {
	            boolean ret = find(root, value);
	            System.out.println("Find " + value + " Return " + ret);
	            return ret;
	      }
	 
	      boolean find(Node curr, String value) {
	            int compare;
	            if (curr == null)
	                  return false;
	            compare = curr.value.compareTo(value);
	            if (compare == 0)
	                  return true;
	            else {
	                  if (compare == 1)
	                        return find(curr.lChild, value);
	                  else
	                	  return find(curr.rChild, value);
	            }
	      }
	 
	      int frequency(String value) {
	            return frequency(root, value);
	      }
	 
	      int frequency(Node curr, String value) {
	            int compare;
	            if (curr == null)
	                  return 0;
	 
	            compare = curr.value.compareTo(value);
	            if (compare == 0)
	                  return curr.count;
	            else {
	                  if (compare > 0)
	                        return frequency(curr.lChild, value);
	                  else
	                        return frequency(curr.rChild, value);
	            }
	      }
	 
	      void freeTree() {
	            root = null;
	      }
	}