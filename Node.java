package lists114.list;

/** Singly linked list node */
public class Node<E> {
	private E element; // Value for this node
	private Node<E> next; // Pointer to next node in list

	// Constructors
	public Node(E it, Node<E> nextval){ 
		element = it; 
		next = nextval; 
	}

	public Node(Node<E> nextval) { 
		next = nextval; 
	}
	// Return next field
	public Node<E> next() {
		return next; 
	} 
	// Set next field
	public Node<E> setNext(Node<E> nextval) {
		return next = nextval; 
	} 
	// Return element field
	public E element() { 
		return element; 
	} // Set element field
	
	public E setElement(E it) {
		return element = it; 
	}
}

