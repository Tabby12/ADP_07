package AB7;

public interface BinarySearchTree<T extends Comparable<T>> {
	
	void addNode(Node<T> data);
	void traverse(NodeOrder order);

}
