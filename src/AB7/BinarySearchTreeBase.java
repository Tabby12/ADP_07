package AB7;

public abstract class BinarySearchTreeBase<T extends Comparable<T>> implements BinarySearchTree<T> {
	
	/**
	 * Gibt den Baum in pre-order Reihenfolge aus.(n-l-r)
	 * (l = left, r = right, n = node)
	 * 
	 * @param node Der Knoten ab dem die Reihenfolge ausgegeben
	 * werden soll. Wenn der ganze Baum ausgegeben werden soll
	 * wird hier der Wurzel-Knoten uebergeben
	 */
	protected void preorderRecursive(Node<T> node)
	{
		if(node != null)
		{
			System.out.print(node.getData().toString() + " ");	
			preorderRecursive(node.left);
			preorderRecursive(node.right);
		}
	}
	
	/**
	 * Gibt den Baum in post-order Reihenfolge aus.(l-r-n)
	 * (l = left, r = right, n = node)
	 * 
	 * @param node Der Knoten ab dem die Reihenfolge ausgegeben
	 * werden soll. Wenn der ganze Baum ausgegeben werden soll
	 * wird hier der Wurzel-Knoten uebergeben
	 */
	protected void postorderRecursive(Node<T> node)
	{
		if(node != null)
		{ 
			postorderRecursive(node.left);
			postorderRecursive(node.right);
			System.out.print(node.getData().toString() + " ");
		}
	}
	
	/**
	 * Gibt den Baum in in-order Reihenfolge aus.(l-n-r)
	 * (l = left, r = right, n = node)
	 * 
	 * @param node Der Knoten ab dem die Reihenfolge ausgegeben
	 * werden soll. Wenn der ganze Baum ausgegeben werden soll
	 * wird hier der Wurzel-Knoten uebergeben
	 */
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
