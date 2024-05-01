package ejercicio3;

class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}

class ListLinked<T> {
    private Nodo<T> primero;

    public ListLinked() {
        this.primero = null;
    }

    public void insertLast(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            Nodo<T> actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void deleteNth(int n) {
        int longitud = length();
        if (n >= longitud) {
            System.out.println("Fuera de rango");
        } else if (n == 0) {
            this.primero = this.primero.getSiguiente();
        } else {
            Nodo<T> aux = this.primero;
            int i = 0;
            while (i < n - 1) {
                aux = aux.getSiguiente();
                i++;
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
    }

    public void mostrar() {
        Nodo<T> actual = this.primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    private int length() {
        int longitud = 0;
        Nodo<T> actual = this.primero;
        while (actual != null) {
            longitud++;
            actual = actual.getSiguiente();
        }
        return longitud;
    }
}