package BST;

public class BST {

	public Node createNode(int data) {
		Node a=new Node();
		a.data=data;
		a.left=null;
		a.right=null;
		return a;
	}

	public Node insert(Node node,int data) {
		if(node==null) {
			return createNode(data);
		}
		else {
			if(data<node.data) {
				node.left=insert(node.left,data);
			}
			else
				node.right=insert(node.right,data);
		}
		return node;
	}

	public Node deleteRec(Node root, int key) 
	{ 
		if (root == null)  return root; 
		if (key < root.data) 
			root.left = deleteRec(root.left, key); 
		else if (key > root.data) 
			root.right = deleteRec(root.right, key); 
		else
		{ 
			if (root.left == null) 
				return root.right; 
			else if (root.right == null) 
				return root.left; 
			root.data = minValue(root.right); 
			root.right = deleteRec(root.right, root.data); 
		} 
		return root; 
	} 

	int minValue(Node root) 
	{ 
		int minv = root.data; 
		while (root.left != null) 
		{ 
			minv = root.left.data; 
			root = root.left; 
		} 
		return minv; 
	} 

	public Node getsuccessor(Node node) {
		if(node==null)
			return null;
		Node temp=node.left.right;
		while(temp!=null) {
			temp=temp.left;
		}
		return temp;
	}

	public void inorder(Node node) {
		if(node==null)
			return ;
		inorder(node.left);
		System.out.println(node.data+ " ");
		inorder(node.right);
	}

	public void preorder(Node node) {
		if(node==null)
			return ;
		System.out.println(node.data+ " ");
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder(Node node) {
		if(node==null)
			return ;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data+ " ");

	}

	public Node search(Node root, int key) 
	{ 
		if (root==null || root.data==key) 
			return root; 
		if (root.data > key) 
			return search(root.left, key); 
		return search(root.right, key); 
	}

	public int size(Node node) 
	{ 
		if (node == null) 
			return 0; 
		else
			return(size(node.left) + 1 + size(node.right)); 
	} 

	public int findHeight(Node temp){  
		if(temp == null) {  
			System.out.println("Tree is empty");  
			return 0;  
		}  
		else {  
			int leftHeight = 0, rightHeight = 0;  
			if(temp.left != null)  
				leftHeight = findHeight(temp.left);  
			if(temp.right != null)  
				rightHeight = findHeight(temp.right);  
			int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;  
			return (max + 1);  
		}  
	}
	
	int maxValue(Node root) 
	{ 
		int max = root.data; 
		while (root.right != null) 
		{ 
			max = root.right.data; 
			root = root.right; 
		} 
		return max; 
	}
	
	void calculateLevelSum(Node node, int level, int sum[])  
	{  
		if (node == null)  
			return;  
		sum[level] += node.data;
		calculateLevelSum(node.left, level + 1, sum);
		calculateLevelSum(node.right, level + 1, sum);
	}     
	boolean isBST(Node root)  { 
        return isBSTUtil(root, Integer.MIN_VALUE, 
                               Integer.MAX_VALUE); 
    } 
    boolean isBSTUtil(Node node, int min, int max) 
    { 
        if (node == null) 
            return true; 
        if (node.data < min || node.data > max) 
            return false; 
        return (isBSTUtil(node.left, min, node.data-1) && 
                isBSTUtil(node.right, node.data+1, max)); 
    } 
}