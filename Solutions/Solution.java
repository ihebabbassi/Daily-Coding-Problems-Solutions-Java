public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = solution.new TreeNode(2);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(2);
        System.out.println(solution.countUnivalSubtrees(root));
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.val != root.left.val) {
            return false;
        }
        if (root.right != null && root.val != root.right.val) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    //count the number of unival subtrees.
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isUnivalTree(root)) {
            return 1 + countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
        } else {
            return countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
        }
    }
}


