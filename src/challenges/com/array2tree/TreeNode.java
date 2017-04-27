package challenges.com.array2tree;

public class TreeNode {

	TreeNode left;
	TreeNode right;
	int value;

	TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	TreeNode(int value) {
		this(value, null, null);
	}

	@Override
	public String toString() {
		return "[" + value + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TreeNode) {
			TreeNode other = (TreeNode) obj;

			return other.value == other.value;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return 7 * value;
	}
}