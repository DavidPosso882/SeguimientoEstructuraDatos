package Pilas;

import java.util.HashSet;
import java.util.Set;

public class Stack<T> {

	private Node<T> top;
	private int size;

	public Stack() {
		this.top = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(top);
		top = newNode;
		size++;
	}

	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("La pila está vacía");
		}
		T dataToReturn = top.getNodeValue();
		top = top.getNextNode();
		size--;
		return dataToReturn;
	}

	public void clear() {
		top = null;
		size = 0;
	}

	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("La pila está vacía");
		}
		return top.getNodeValue();
	}

	public Node<T> getTop() {
		return top;
	}

	public int getSize() {
		return size;
	}

	public void add(Stack<T> stackToAdd) {
		Stack<T> tempStack = new Stack<>();
		Node<T> currentFromOther = stackToAdd.top;

		while (currentFromOther != null) {
			tempStack.push(currentFromOther.getNodeValue());
			currentFromOther = currentFromOther.getNextNode();
		}

		while (!tempStack.isEmpty()) {
			this.push(tempStack.pop());
		}
	}

	public void print() {
		System.out.print("Pila (cima -> fondo): ");
		Node<T> current = top;
		while(current != null) {
			System.out.print(current.getNodeValue() + " ");
			current = current.getNextNode();
		}
		System.out.println();
	}

	@Override
	protected Stack<T> clone() {
		Stack<T> clonedStack = new Stack<>();
		Stack<T> tempStack = new Stack<>();

		Node<T> current = this.top;
		while (current != null) {
			tempStack.push(current.getNodeValue());
			current = current.getNextNode();
		}

		while (!tempStack.isEmpty()) {
			clonedStack.push(tempStack.pop());
		}

		return clonedStack;
	}

	public void eliminarDuplicados() {
		if (size <= 1) {
			return;
		}

		Set<T> elementosVistos = new HashSet<>();
		Stack<T> pilaAuxiliar = new Stack<>();

		while (!this.isEmpty()) {
			T elementoActual = this.pop();
			if (elementosVistos.add(elementoActual)) {
				pilaAuxiliar.push(elementoActual);
			}
		}

		while (!pilaAuxiliar.isEmpty()) {
			this.push(pilaAuxiliar.pop());
		}
	}
}