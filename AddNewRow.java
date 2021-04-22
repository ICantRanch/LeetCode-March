package LeetCode.March;

public class AddNewRow {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	int newVal;
	int newDepth;

	public TreeNode addOneRow(TreeNode root, int val, int depth) {

		newVal = val;
		newDepth = depth;	
		
		if(depth == 1) {
			root = new TreeNode(val,root,null);
		}else {
			traverse(root,1);	
		}
		
		return root;
		
	}



	public void traverse(TreeNode a, int level){

		if(level == newDepth-1) {		
			a.left = new TreeNode(newVal,a.left,null);
			a.right = new TreeNode(newVal,null,a.right);
		}else {
			if(a.left != null) {traverse(a.left,level+1);}
			if(a.right != null) {traverse(a.right,level+1);}
		}
	}


}

