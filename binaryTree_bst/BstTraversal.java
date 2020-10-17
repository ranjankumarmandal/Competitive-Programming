package binaryTree_bst;
//Here, we are working on isBST, BST depthFirst traversal problems.

class Tnode {
	int i;
	Tnode l;
	Tnode r;
	
	Tnode(int data) {
		i = data;
		l = null;
		r = null;
	}
}

public class BstTraversal {
	
	private void inOrder(Tnode root) {
		if(root == null) return;
		
		inOrder(root.l);
		System.out.print(root.i+" ");
		inOrder(root.r);
	}
	
	private void preorder(Tnode root) {
		if(root == null) return;
		
		System.out.print(root.i+" ");
		preorder(root.l);
		preorder(root.r);
	}
	
	private void postorder(Tnode root) {
		if(root == null) return;
		
		postorder(root.l);
		postorder(root.r);
		System.out.print(root.i+" ");
	}
	
	private boolean isBST(Tnode root, int lb, int ub) {
		if(root == null) return true;
		else if(root.i<lb || root.i>ub) return false;
		
		return isBST(root.l, lb, root.i) && isBST(root.r, root.i, ub);
	}
	
	public int kth = 3;
	private void kthSmallestElement(Tnode root) {
		if(root == null) return;
		if(kth <= 0) return;
		
		kthSmallestElement(root.l);
		
		kth--;
		if(kth == 0) System.out.println(root.i);
		
		kthSmallestElement(root.r);
	}
	
	public static void main(String[] args) {
		BstTraversal obj = new BstTraversal();
		
		Tnode root = new Tnode(10);
		root.l = new Tnode(5);
		root.r = new Tnode(20);
		
		root.l.l = new Tnode(3);
		root.l.r = new Tnode(8);
		
		root.r.l = new Tnode(15);
		root.r.r = new Tnode(30);
		
		obj.inOrder(root);
		System.out.println();
		obj.preorder(root);
		System.out.println();
		obj.postorder(root);
		System.out.println();
		System.out.println(obj.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println();
		obj.kthSmallestElement(root);
		
	}

}
