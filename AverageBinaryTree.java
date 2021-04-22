package LeetCode.March;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics;

public class AverageBinaryTree {

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
	
	public static class sum{
		
		double sum;
		int elements;
	}
	
	
	static List<sum> sums = new ArrayList<sum>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode a = new TreeNode(12);
		System.out.println(averageOfLevels(a).toString());
		
		

	}
	
	
	public static List<Double> averageOfLevels(TreeNode root) {
		
		traverse(root,0);
		
		List<Double> result = new ArrayList<Double>();
		for (int i = 0; i < sums.size(); i++) {
			result.add(sums.get(i).sum/sums.get(i).elements);
		}
		
		return result;
		
	}
	
	public static void traverse(TreeNode a, int level) {
		
		if(sums.size() <= level) {
			sums.add(level, new sum());
		}
		sums.get(level).sum += a.val;
		sums.get(level).elements++;
		
		if(a.left != null) {
			traverse(a.left,level+1);
		}
		if(a.right != null) {
			traverse(a.right,level+1);
		}
	}

}
