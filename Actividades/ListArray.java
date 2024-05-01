
public class ListArray<T> implements TDAList<T> {
	T[] array;
	
	public ListArray(int size) {
		// casting
		this.array = (T[]) new Object[size];
	}

	// Verifica si la lista está vacía
	@Override
	public boolean isEmptyList() {
		return length() == 0;
	}

	// Calcula la longitud de la lista
	@Override
	public int length() {
		int cont = 0;
		for(T index : array) {
			if(index != null) {
				cont++;
			}
		}
		return cont;
	}

	// Destruye la lista estableciendo cada elemento
	// del arreglo como nulo
	@Override
	public void destroyList() {
		for(int i = 0; i < array.length; i++) {
			array[i] = null;
		}
		System.out.print("Lista destruida");
	}

	// Busca un elemento en el arreglo y utiliza el
	// método equals para verificar si son iguales
	@Override
	public int search(T x) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null && array[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}

	// Inserta un elemento al inicio de la lista,
	// desplazando los elementos existentes hacia la derecha
	@Override
	public void insertFirst(T x) {
		if(length() == array.length) {
			System.out.println("No hay espacio.");
		}
		else {
			for(int i = array.length - 1; i > 0; i--) {
				array[i] = array[i-1];
			}
			array[0] = x;
		}
	}

	// Inserta un elemento al final de la lista
	// si hay espacio disponible en el arreglo
	@Override
	public void insertLast(T x) {
		if(length() == array.length) {
			System.out.println("No hay espacio.");
		}
		else {
			array[length()] = x;
		}
	}

	// Elimina un elemento de la lista estableciéndolo como nulo
	@Override
	public void removeNode(T x) {
		int index = search(x);
		if(index >= 0) {
			for(int i = index; i < array.length -1; i++) {
				array[i] = array[i + 1];
			}
			array[array.length - 1] = null;
		}
	}
	
	// Imprime todos los elementos de la lista
	public void print() {
		for(T index : array) {
			if(index != null) {
				System.out.println(index);
			}
		}
	}
}
