
public class LinkedList<T> implements TDAList<T> {
	protected Node<T> first;
	
	public LinkedList() {
		this.first = null;
	}
	
	public Node<T> getFirst() {
		return this.first;
	}

	public void setFirst(Node<T> node) {
		this.first = node;
	}

	// Función para determinar si la lista está vacía
	// Poscondición: devuelve true si la lista está vacía; de lo contrario, devuelve false
	@Override
	public boolean isEmptyList() {
		return this.first == null;
	}

	// Función para devolver el número de nodos de la lista
	// Poscondición: se devuelve el valor del contador
	@Override
	public int length() {
		int cont = 0;
		Node <T> aux = this.first;
		while(aux != null) {
			cont++;
			aux = aux.getNext();
		}
		return cont;
	}

	// Función para eliminar todos los nodos de la lista
	@Override
	public void destroyList() {
		this.first = null;
	}

	// Función para determinar si searchItem está en la lista
	// Postcondición: devuelve la posición si se encuentra searchItem en la lista; de lo contrario, devuelve -1
	@Override
	public int search(T x) {
		Node <T> aux = this.first;
		int i = 0;
		while(aux != null) {
			if(aux.getData() != null && aux.getData().equals(x)) {
				return i;
			}
			aux = aux.getNext();
			i++;
		}
		return -1;
	}

	// Inserta un elemento al inicio de la lista
	@Override
	public void insertFirst(T x) {
		Node <T> node = new Node<>(x);
		node.setNext(this.first);
		this.first = node;
	}

	// Inserta un elemento al final de la lista
	@Override
	public void insertLast(T x) {
		Node <T> node = new Node<T>(x);
		Node <T> aux = this.first;
		if(this.first == null)
			this.first = node;
		else
			while(aux.getNext() != null)
				aux = aux.getNext();
			aux.setNext(node);
			node.setNext(null);
	}

	// Función para eliminar deleteItem de la lista
	@Override
	public void removeNode(T x) {
		int pos = search(x);
		int cont = length();
		if(pos == -1)
			System.out.print("Elemento no existe");
		else if(pos == cont - 1) {
			int i = 0;
			Node <T> aux = this.first;
			while(i < cont - 2);{
				aux = aux.getNext();
				i++;
			}
			aux.setNext(null);
		}
		else if(pos == 0)
			this.first = this.first.getNext();
		else {
			int i = 0;
			Node <T> aux = this.first;
			while(i < pos - 1) {
				aux = aux.getNext();
				i++;
			}
			aux.setNext(aux.getNext().getNext());
		}
	}
	
	// Imprime la lista
	public void print() {
		Node <T> aux = this.first;
		while(aux != null) {
			System.out.print(aux.getData());
			aux = aux.getNext();
			if(aux != null)
				System.out.print(" -> ");
		}
		System.out.println();
	}
}
