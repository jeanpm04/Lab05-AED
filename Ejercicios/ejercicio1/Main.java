package ejercicios;

public class Main {
    public static void main(String[] args) {
        Node<Character> node1 = new Node<>('a', new Node<>('b', new Node<>('c', new Node<>('c', null))));
        Node<Integer> node2 = new Node<>(47, new Node<>(89, new Node<>(56, new Node<>(89, new Node<>(89, new Node<>(56, null))))));
        Node<Integer> node3 = new Node<>(1, new Node<>(2, new Node<>(3, new Node<>(4, new Node<>(5, new Node<>(6, null))))));
        Node<String> node4 = new Node<>("Luis", new Node<>("Rodrigo", new Node<>("Luis", null)));


        System.out.println("Nodo 1:");
        System.out.println(node1); 
        node1.deleteDuplicado();
        System.out.println("eliminar duplicados :");
        System.out.println(node1); 

        System.out.println("Nodo2:");
        System.out.println(node2); 
        node2.deleteDuplicado();
        System.out.println("eliminar duplicados:");
        System.out.println(node2); 

        System.out.println("Nodo 3:");
        System.out.println(node3); 
        node3.deleteDuplicado();
        System.out.println("eliminar duplicados:");
        System.out.println(node3); 

        System.out.println("Nodo 4 :");
        System.out.println(node4); 
        node4.deleteDuplicado();
        System.out.println("eliminar duplicados:");
        System.out.println(node4); 
    }
}
