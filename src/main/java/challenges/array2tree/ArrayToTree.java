package challenges.array2tree;

/*
 * You are given a non-null array of integers. Implement 
 * the method arrayToTree which creates a binary tree 
 * from its values in accordance to their order, while 
 * creating nodes by depth from left to right.
 * 
 * For example, given the array [17, 0, -4, 3, 15] you 
 * should create the following tree:
 * 
 * 			17
 * 		   /  \
 * 		  0   -4
 * 		 / \
 * 		3   15
 */
public class ArrayToTree {

  public static TreeNode arrayToTree(int[] array) {
    TreeNode root = null;
    TreeNode parent = null;
    TreeNode oldParent = null;

    if (array != null && array.length > 0) {
      for (int index = 0; index < array.length; index++) {
        int element = array[index];

        if (root == null) {
          root = new TreeNode(element);
          parent = root;
        } else {
          while (true) {
            TreeNode left = parent.left;
            TreeNode right = parent.right;

            if (left == null) {
              left = new TreeNode(element);
              parent.left = left;
              break;
            } else if (right == null) {
              right = new TreeNode(element);
              parent.right = right;
              break;
            } else {
              if (oldParent == null) {
                oldParent = parent;
                parent = parent.left;
              } else {
                parent = oldParent.right;
                oldParent = null;
              }
            }
          }
        }
      }
    }

    return root;
  }
}
