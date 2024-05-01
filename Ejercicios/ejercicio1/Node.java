package ejercicios;

class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next;
    
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public void deleteDuplicado() {
        Node<T> current = this;
        while (current != null) {
            Node<T> runner = current;
            while (runner.next != null) {
                if (runner.next.data.compareTo(current.data) == 0) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node<T> current = this;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("}");
        return sb.toString();
    }
}


