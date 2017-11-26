package AB7;

public abstract class BinarySearchTreeBase<T extends Comparable<T>> implements BinarySearchTree<T> {

	protected void preorderRecursive(Node<T> node)
	{
		if(node != null)
		{
			System.out.print(node.getData().toString() + " ");	
			preorderRecursive(node.left);
			preorderRecursive(node.right);
		}
	}
	
	protected void postorderRecursive(Node<T> node)
	{
		if(node != null)
		{ 
			postorderRecursive(node.left);
			postorderRecursive(node.right);
			System.out.print(node.getData().toString() + " ");
		}
	}
	
	protected void inorderRecursive(Node<T> node)
	{
		if(node != null)
		{
			inorderRecursive(node.left);
			System.out.print(node.getData().toString() + " ");
			inorderRecursive(node.right);
		}
	}
	
}
