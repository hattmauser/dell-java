//linkedlist backed by node. each node knows where it came from. list class only knows parent.
//node: knows value -> String,  next node -> node

/**
 * implementation of linked list that stores list of strings
 * @author Matthew_Hauser
 *
 */
public class StringList {

	private Node root;
	
	private Node end;
	
	/*** the size of the list*/
	private int size;
	
	/**
	 * return the value at the position in the list
	 * @param index the position of the value to return
	 * @return the value at the position
	 */
	public String get(int index) {
		Node node = getNode(index);
		return node.getNodeValue();
	}
	
	/**
	 * add new string to linked list
	 * @param value the value to add to the list
	 */
	public void add(String value) {
		Node newNode = new Node(value);
		
		if(root == null) {
			root = newNode;
		} else {
			end.setNext(newNode);
		}
		
		end = newNode;
		size++;
	}
	
	private Node getNode(int index) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("Out of bounds of this list");
		}
		
		if(index == 0) {
			return root;
		}
		
		if(index == size -1) {
			return end;
		}
		
		Node currentNode = root;
		for(int i=1; i<index;i++) {
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
	}
	
	public void remove(int index) {
		
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("Out of bounds of this list");
		}
		
		if(index == 0) {
			if(size == 1) {
				root = null;
			} else {
				root = root.getNextNode();
			}
			
			size--;
			return;
			
		}else if(index == size-1) {
			Node newEnd = getNode(index-1);
			end = newEnd;
			newEnd.clearNext();
			size--;
		} else {
			Node prev = getNode(index -1);
			Node current = prev.getNextNode();
			Node next = current.getNextNode();
			prev.setNext(next);
			size--;
			
		}
	}
	
	/**
	 * @return size of list
	 */
	public int size() {
		return size;
	}
	
	
	
}
