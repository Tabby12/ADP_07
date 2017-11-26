package AB7;

public class Node<T>{
	
	private T data;
	
	public Node<T> left;
	
	public Node<T> right;
	
	public Node<T> parent;

	public T getData() {
		return data;
	}
	
	public Node(T data) {
		this.data = data;
	}
}
