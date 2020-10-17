package binaryTree_bst;

//class Tnode {
//	int i;
//	Tnode l;
//	Tnode r;
//	
//	Tnode(int data) {
//		i = data;
//		l = null;
//		r = null;
//	}
//}   //Here we are finding like whether given two binary tree (not BST) are mirror of each other or not. 

public class IsBinarytriesMirror {
	
	private boolean isMirror(Tnode root, Tnode root1) {
		if(root==null && root1==null) return true;
		else if(root==null && root1!=null) return false;
		return (root.i==root1.i) && isMirror(root.l, root1.r) && isMirror(root.r, root1.l);
	}
	
	public static void main(String[] args) {
		IsBinarytriesMirror obj = new IsBinarytriesMirror();
		
		//*--------------------
		Tnode root = new Tnode(10);
		root.l = new Tnode(5);
		root.r = new Tnode(20);
		
		//*-------------------
		
		Tnode root1 = new Tnode(10);
		root1.l = new Tnode(20);
		root1.r = new Tnode(5);
		//*--------------------
		
		System.out.println(obj.isMirror(root, root1));
	}

}
