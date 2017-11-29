package AB7;

/**
 * Ein Knoten in einem Bin�rbaum.
 */
public class Node<T>{
	
	/**
	 * Die eigentlichen Daten.
	 */
	private T data;
	
	/**
	 * Referenz auf den linken Sohnknoten.
	 */
	public Node<T> left;
	
	/**
	 * Referenz auf den rechten Sohnknoten.
	 */
	public Node<T> right;
	
	/**
	 * Gibt die Daten zur�ck.
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * Konstruktor.
	 * 
	 * @param data Die zu speichernden Daten im Knoten.
	 */
	public Node(T data) {
		this.data = data;
	}
}
