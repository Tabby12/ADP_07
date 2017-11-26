package AB7;

public class Test
{
	public static void main(String[] args)
	{
		BinarySearchTreeLinked<Integer> bsLinked = new BinarySearchTreeLinked<Integer>();
		Node<Integer> node1 = new Node<Integer>(Integer.valueOf(1));
		Node<Integer> node2 = new Node<Integer>(Integer.valueOf(2));
		Node<Integer> node3 = new Node<Integer>(Integer.valueOf(3));
		Node<Integer> node5 = new Node<Integer>(Integer.valueOf(5));
		Node<Integer> node6 = new Node<Integer>(Integer.valueOf(6));
		Node<Integer> node7 = new Node<Integer>(Integer.valueOf(7));
		Node<Integer> node8 = new Node<Integer>(Integer.valueOf(8));
		
		bsLinked.addNode(node5);
		bsLinked.addNode(node2);
		bsLinked.addNode(node8);
		bsLinked.addNode(node1);
		bsLinked.addNode(node3);
		bsLinked.addNode(node6);
		bsLinked.addNode(node7);
		System.out.println("Linked: ");
		System.out.print("INORDER: ");
		bsLinked.traverse(NodeOrder.INORDER);
		System.out.println();
		System.out.print("POSTORDER: ");
		bsLinked.traverse(NodeOrder.POSTORDER);
		System.out.println();
		System.out.print("PREORDER: ");
		bsLinked.traverse(NodeOrder.PREORDER);
		System.out.println();
		System.out.println();
		
		BinarySearchTreeArray<Integer> bsArr = new BinarySearchTreeArray<Integer>();
		bsArr.addNode(node5);
		bsArr.addNode(node2);
		bsArr.addNode(node8);
		bsArr.addNode(node1);
		bsArr.addNode(node3);
		bsArr.addNode(node6);
		bsArr.addNode(node7);
		System.out.println("Array: ");
		System.out.print("INORDER: ");
		bsArr.traverse(NodeOrder.INORDER);
		System.out.println();
		System.out.print("POSTORDER: ");
		bsArr.traverse(NodeOrder.POSTORDER);
		System.out.println();
		System.out.print("PREORDER: ");
		bsArr.traverse(NodeOrder.PREORDER);
	}
}
