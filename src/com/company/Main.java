package com.company;


import com.company.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //两数之和等于目标值
//        Solution solution = new Solution();
//        int[] ss = new int[]{3, 3, -9};
////        int maxProduct = solution.maxProduct(ss);
////        System.out.println("args = " + maxProduct);
//
//        int[] ints = solution.twoSum(ss, -6);
//        System.out.println(ints[0] + " , " + ints[1]);

        Main main = new Main();

        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        root.right = right;
        right.left = new TreeNode(3);

//        System.out.println("postorderTraversal() = " + main.postorderTraversal(root));
        System.out.println("postorderTraversal() = " + main.levelOrder(root));


    }


    //后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        getData(result, root);
        return result;
    }

    public void getData(List<Integer> result, TreeNode root) {
        if (root != null) {
            getData(result, root.left);
            getData(result, root.right);
            result.add(root.val);

        }
    }

    //层序遍历
    //f-b-g-a-d-i-c-e-h

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getData2(result, root);
        return result;
    }

    public void getData2(List<List<Integer>> result, TreeNode root) {
        if (root != null) {
            if(root.left!=null || root.right!=null ){
                if(root.left!=null){
                    ArrayList<Integer> e = new ArrayList<>();
                    e.add(root.val);
                    result.add(e);
                    getData2(result, root.left);
                }else if(root.right!=null){
                    ArrayList<Integer> e = new ArrayList<>();
                    e.add(root.val);
                    result.add(e);
                    getData2(result, root.right);
                }
            }else{
                ArrayList<Integer> e = new ArrayList<>();
                e.add(root.val);
                result.add(e);
            }
        }
    }

}
