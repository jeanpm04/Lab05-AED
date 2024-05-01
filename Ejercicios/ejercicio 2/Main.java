package ejerccios2;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list1 = new LinkedList<>();
        list1.insertNth('a', 0);
        list1.insertNth('b', 1);
        list1.insertNth('d', 2);
        list1.imprimir();

        list1.insertNth('c', 2);
        list1.imprimir();

        list1.insertNth('c', 3);
        list1.imprimir();

        list1.insertNth('c', 6);
        

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insertNth(10, 0);
        list2.insertNth(20, 1);
        list2.insertNth(30, 2);
        list2.imprimir();

        list2.insertNth(5, 0);
        list2.imprimir();
    }
}