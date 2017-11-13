import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;


/*
 * 問題1：如果輸出整個鏈表 前中後遍歷
 * 問題2：輸出整個數的圖案
 */


public class MaxBinaryTree {
// Definition for a binary tree node.
	
	static class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { 
		    	 val = x;
		    	 this.left = null;
		    	 this.right = null;
		     }
		}

		 public static TreeNode constructMaximumBinaryTree(int[] nums){
			 if(nums.length == 0){
				 return null;
			 }
			 TreeNode a = constructMaximumBinaryTree(nums,0,nums.length-1);
			 System.out.println(a.val);
			 return a;
		 }
		 
		 public static TreeNode constructMaximumBinaryTree(int[] nums, int lo, int hi){
			 if(lo > hi) {return null;}
		        int index = lo;
		        for (int i = lo + 1; i <= hi; i++) {
		            if (nums[i] > nums[index]) {
		                index = i;
		            }
		        }
			 TreeNode root =  new TreeNode(nums[index]);
			 root.left = constructMaximumBinaryTree(nums, lo, index-1);
			 root.right = constructMaximumBinaryTree(nums, index+1, hi);
			 return root;
		 }
	


///*
// * 中序遍歷
// */
//public static void inOderRec(TreeNode root){
//	if(root != null){
//		inOderRec(root.left);
//		System.out.println(root.val);
//		inOderRec(root.right);
//	}
//}	
///*
// * 前序
// */
//public void preOderRec(TreeNode root){
//	if(root != null){
//		System.out.println(root.val);
//		preOderRec(root.left);
//		preOderRec(root.right);
//	}
//}	
//
///*
// * 後序
// */
//public void postOderRec(TreeNode root){
//	if(root != null){
//		postOderRec(root.left);
//		postOderRec(root.right);
//		System.out.println(root.val);
//	}
//}
	


	
	
	
	
	
	/*
	 * unit test
	 */
	public static void main(String[] args) {
		MaxBinaryTree mbt = new MaxBinaryTree();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		Integer[] IntegerArray = new Integer[]{0};
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			al.add(a);		
		}
		 int[] intArray = ArrayUtils.toPrimitive(al.toArray(IntegerArray));
		 //System.out.println(Arrays.toString(intArray));
		// mbt.constructMaximumBinaryTree(intArray);
		// mbt.inOderRec(mbt.root);
		 constructMaximumBinaryTree(intArray);
//		 inOderRec(root);
	}

}
