
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray<Person> list = new ListArray(4);
		// Insertar tres elementos al principio de la lista
		list.insertFirst(new Person("Ana", "Choque", 22));
		list.insertFirst(new Person("Carlos", "Carnero", 20));
		list.insertFirst(new Person("Anthony", "Delgado", 22));
		list.print();
		
		System.out.print("Lista vacia? " + list.isEmptyList());
		System.out.print("\nTamanio de la lista... " + list.length());
		System.out.print("\nBuscando a Carlos... " + list.search(new Person
				("Carlos", "Carnero", 20)));
		System.out.print("\nBuscando a Anthony... " + list.search(new Person
				("Anthony", "Delgado", 19)));
		System.out.print("\nEliminando a Carlos... ");
		// Eliminar un elemento de la lista
		list.removeNode(new Person("Carlos", "Carnero", 20));
		System.out.print("\nBuscando a Carlos... " + list.search(new Person
				("Carlos", "Carnero", 20)));
		System.out.println();
		list.print();
		// Insertar un elemento al final de la lista
		list.insertLast(new Person("Enrique", "Carnero", 25));
		System.out.println();
		list.print();
		// Destruir la lista
		list.destroyList();
		System.out.print("\nLista vacia? " + list.isEmptyList());
		list.print();
		
		System.out.println("\n-----> Ejercicios <-----");
		LinkedList<Person> list1 = new LinkedList<>();
		// Insertar elementos al principio de la lista
		list1.insertFirst(new Person("Ana", "Choque", 22));
		list1.insertFirst(new Person("Carlos", "Carnero", 20));
		list1.insertFirst(new Person("Anthony", "Delgado", 22));
		list1.print();
		
		System.out.print("Lista vacia? " + list1.isEmptyList());
		System.out.print("\nTamanio de la lista... " + list1.length());
		System.out.print("\nBuscando a Carlos... " + list1.search(new Person
				("Carlos", "Carnero", 20)));
		System.out.print("\nBuscando a Anthony... " + list1.search(new Person
				("Anthony", "Delgado", 19)));
		System.out.print("\nEliminando a Carlos... ");
		// Eliminar un elemento de la lista
		list1.removeNode(new Person("Carlos", "Carnero", 20));
		System.out.print("\nBuscando a Carlos... " + list1.search(new Person
				("Carlos", "Carnero", 20)));
		System.out.println();
		list1.print();
		// Insertar un elemento al final de la lista
		list1.insertLast(new Person("Enrique", "Carnero", 25));
		System.out.println();
		list1.print();
		// Destruir la lista
		list1.destroyList();
		System.out.print("\nLista vacia? " + list1.isEmptyList());
		list1.print();
	}

}
