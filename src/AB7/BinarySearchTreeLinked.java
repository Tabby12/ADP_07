package AB7;

public class BinarySearchTreeLinked<T extends Comparable<T>> extends BinarySearchTreeBase<T> {
	
	private Node<T> root;

	public BinarySearchTreeLinked()
	{
		root = null;
	}
	
	@Override
	public void addNode(Node<T> node) {
		if (root == null)
		{
			root = node;
		}
		else
		{
			addNodeRecursive(root, node);
		}
	}
	
	private void addNodeRecursive(Node<T> root, Node<T> node)
	{
		if (node.getData().compareTo(root.getData()) == 1)
		{
			if (root.right == null)
			{
				root.right = node;
			}
			else
			{
				addNodeRecursive(root.right, node);
			}
		}
		else
		{
			if (root.left == null)
			{
				root.left = node;
			}
			else
			{
				addNodeRecursive(root.left, node);
			}
		}
	}

	@Override
	public void traverse(NodeOrder order) 
	{
		if(order == NodeOrder.INORDER)
		{
			inorderRecursive(root);
		}
		else if(order == NodeOrder.POSTORDER)
		{
			postorderRecursive(root);
		}
		else
		{
			preorderRecursive(root);
		}
	}

}
