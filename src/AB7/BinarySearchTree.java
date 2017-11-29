package AB7;

public interface BinarySearchTree<T extends Comparable<T>> {
	/**
	 * Fuegt dem Baum einen Knoten hinzu. Bei Elementen die kleiner als der
	 * Vater-Knoten sind wird auf der linken Seite des Vater-Knotens 
	 * nach einem freien Platz gesucht, bei Elementen die groesser als 
	 * der Vater-Knoten sind wird rechts nach einem freien Platz gesucht.
	 * Die Methode sucht solange bis ein freier, passender
	 * Platz gefunden wurde und fuegt den Knoten an diesem ein. 
	 * Gleiche Elemente fuehren zu einer IllegalArgumentException.
	 * 
	 * @param node Der Knoten der eingefuegt werden soll 
	 */
	void addNode(Node<T> node);
	
	/**
	 * Gibt den binaeren Suchbaum in der gewuenschten Reihenfolge aus,
	 * moeglich sind hierbei In-Order, Post-Order und Pre-Order.
	 * 
	 * @param order Die gewuenschte Reihenfolge
	 */
	void traverse(NodeOrder order);

}
