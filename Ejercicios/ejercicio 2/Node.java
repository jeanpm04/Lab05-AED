package ejerccios2;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;
    private int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    public void insertNth(T data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Fuera de rango");
            return;
        }

        Node<T> newNode = new Node<>(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public void imprimir() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

