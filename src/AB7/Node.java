package AB7;

/**
 * Ein Knoten in einem Binärbaum.
 */
public class Node<T>{
	
	private T data;
	
	public Node<T> left;
	
	public Node<T> right;
	
	public T getData() {
		return data;
	}
	
	public Node(T data) {
		this.data = data;
	}
}
