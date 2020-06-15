
public class Node {
	
	/**
	 * The value stored in node
	 */
	private String nodeValue;
	
	/**
	 * reference to next node
	 */
	private Node nextNode;
	
	/**
	 * constructor, passes value of node
	 */
	Node(String nodeValue){
		this.nodeValue = nodeValue;
	}
	
	/**
	 * sets next node in linked list
	 */
	void setNext(Node nextNode) {
		if(nextNode == null) {
			throw new NullPointerException("Cannot set the next node to null.");
		}
		
		this.nextNode = nextNode;
	}
	
	/**
	 * removes next
	 */
	void clearNext() {
		this.nextNode = null;
	}
	
	/**get value of node
	 * 
	 * @return current value of this node
	 */
	String getNodeValue(){
		return nodeValue;
	}
	
	/**
	 * @return the next node in the linked list
	 * @throws if there is no next node referenced
	 */
	Node getNextNode() {
		if(nextNode == null) {
			throw new NullPointerException("There is no next node for this instance.");
		}
		return nextNode;
	}
	
	
}
