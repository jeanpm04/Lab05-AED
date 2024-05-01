
public class ListMerger {

	public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> list1, LinkedList<T> list2) {
		LinkedList<T> mergedList = new LinkedList<>();
		Node<T> aux1 = list1.getFirst();
		Node<T> aux2 = list2.getFirst();

		// Fusionar las dos listas ordenadas mientras ambas listas
		// tengan nodos para comparar
		while(aux1 != null && aux2 != null) {
			// Comparar los datos de los nodos actuales de ambas listas
			if(aux1.getData().compareTo(aux2.getData()) <= 0) {
				// Si el dato de aux1 es menor o igual al de aux2,
				// agregar el dato de aux1 a la lista fusionada
				mergedList.insertLast(aux1.getData());
				aux1 = aux1.getNext(); // Mover al siguiente nodo en la lista 1
			}
			else {
				// Si el dato de aux2 es menor al de aux1,
				// agregar el dato de aux2 a la lista fusionada
				mergedList.insertLast(aux2.getData());
				aux2 = aux2.getNext(); // Mover al siguiente nodo en la lista 2
			}
		}

		// Agregar los nodos restantes de list1 (si los hay)
		while(aux1 != null) {
			mergedList.insertLast(aux1.getData());
			aux1 = aux1.getNext();
		}

		// Agregar los nodos restantes de list2 (si los hay)
		while(aux2 != null) {
			mergedList.insertLast(aux2.getData());
			aux2 = aux2.getNext();
		}

		return mergedList;
	}

	public static void main(String[] args) {
		// Crear las dos listas enlazadas ordenadas
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.insertLast(1);
		list1.insertLast(3);
		list1.insertLast(5);
		list1.insertLast(7);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.insertLast(2);
		list2.insertLast(4);
		list2.insertLast(6);
		list2.insertLast(8);
		list1.print();
		list2.print();
		// Fusionar las dos listas
		LinkedList<Integer> mergedList = merge(list1, list2);

		// Mostrar la lista fusionada
		System.out.println("Lista fusionada:");
		mergedList.print(); // Método para imprimir la lista fusionada
	}
}
