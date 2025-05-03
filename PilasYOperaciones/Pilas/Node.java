package Pilas;

public class Node<T> {

	private Node<T> nextNode;
	private T nodeValue;

	public Node(T nodeValue) {
		this.nodeValue = nodeValue;
		this.nextNode = null;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(T nodeValue) {
		this.nodeValue = nodeValue;
	}
}