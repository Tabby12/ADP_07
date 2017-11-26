package AB7;

public class BinarySearchTreeArray<T extends Comparable<T>> extends BinarySearchTreeBase<T>{
	
	Node<T>[] array;
	
	public BinarySearchTreeArray() 
	{
		array = new Node[10];
	}

	@Override
	public void addNode(Node<T> node) {
		addNodeRecursive(1, node);
	}
	
	private boolean addNodeRecursive(int index, Node<T> node)
	{
		if(array[index] == null)
		{
			array[index] = node;
			return true;
		}
		else if(node.getData().compareTo(array[index].getData()) == 1)
		{
			if(((index * 2) + 1) > array.length)
			{
				enlargeArray();
			}
			boolean addedLeaf = addNodeRecursive((index * 2) + 1, node);
			if(addedLeaf)
			{
				array[index].right = node;
			}
		}
		else
		{
			if(index * 2 > array.length)
			{
				enlargeArray();
			}
			boolean addedLeaf = addNodeRecursive(index * 2, node);
			if(addedLeaf)
			{
				array[index].left = node;
			}
		}
		return false;
	}
	
	private void enlargeArray()
	{
		Node<T>[] newArray = new Node[array.length * 2];
		for (int i = 1; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}
	
	@Override
	public void traverse(NodeOrder order) 
	{
		if(order == NodeOrder.INORDER)
		{
			inorderRecursive(array[1]);
		}
		else if(order == NodeOrder.POSTORDER)
		{
			postorderRecursive(array[1]);
		}
		else
		{
			preorderRecursive(array[1]);
		}
	}

}
