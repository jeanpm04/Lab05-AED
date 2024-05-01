
public class Reverse {
    public static void main(String[] args) {
        // Crear una lista
        LinkedList<Integer> list = new LinkedList<>();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        System.out.println("Lista original:");
        list.print();

        int left = 2;
        int right = 5;

        // Invertir la sublista del índice left al índice right
        reverseSublist(list, left, right);
        System.out.println("Lista despues de invertir [" + left + ", " + right + "]:");
        list.print();
    }

    public static <T> void reverseSublist(LinkedList<T> list, int left, int right) {
        // Verificar si left y right son válidos y si la lista no está vacía
        if(left == right || list.isEmptyList() || left <= 0 || right > list.length()) {
            return;
        }

        // Crear un nodo ficticio para el nodo anterior al índice left
        Node<T> node = new Node<>(null);
        node.setNext(list.getFirst());
        Node<T> ant = node;

        // Mover ant al nodo antes de la posición left
        for(int i = 0; i < left - 1; i++) {
            ant = ant.getNext();
        }

        // Obtener el nodo actual y el siguiente nodo en la sublista
        Node<T> aux = ant.getNext();
        Node<T> next;

        // Invertir la sublista desde left hasta right
        for(int i = 0; i < right - left; i++) {
            next = aux.getNext();
            aux.setNext(next.getNext());
            next.setNext(ant.getNext());
            ant.setNext(next);
        }

        // Actualizar el primer nodo si left es 1
        if(left == 1) {
            list.setFirst(node.getNext());
        }
    }
}
