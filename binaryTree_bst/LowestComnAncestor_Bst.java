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
//}

public class LowestComnAncestor_Bst {
	Tnode lca(Tnode root, int a, int b) {
		if(root == null) return null;
		else if(a<root.i && b<root.i) return lca(root.l, a, b);
		else if(a>root.i && b>root.i) return lca(root.r, a, b);
		return root;
	}
	
	public static void main(String[] args) {
		LowestComnAncestor_Bst obj = new LowestComnAncestor_Bst();
		
		Tnode root = new Tnode(10);
		root.l = new Tnode(5);
		root.r = new Tnode(18);
		
		root.l.l = new Tnode(3);
		root.l.r = new Tnode(8);
		
		root.r.l = new Tnode(15);
		root.r.r = new Tnode(20);
		
		int nodeValue = obj.lca(root, 2, 6).i;
		System.out.println(nodeValue);
	}

}
