package edu.kis.vh.nursery.list;

/**
 * Implementacja listy dla wartości całkowitych.
 */

public class IntLinkedList {

    /**
     * Wartość informująca czy lista jest pusta.
     */

    private static final int DEFAULT_VALUE = -1;

    /**
     * Ostatni węzeł na liście.
     */

    private Node last;

    /**
     * Wartość  tymczasowa, która aktualnie nie jest używana.
     */

    private int i;

    /**
     * Dodanie liczby na koniec listy.
     * @param i liczba która jest dodana na koniec listy.
     */

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Zwraca informację czy lista jest pusta.
     * @return informację czy lista jest pusta.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Zwraca informację czy lista jest pełna. Metoda nie jest obecnie używana.
     * @return informację czy lista jest pełna.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość ostatniego elementu na liście bez usuwania go. Metoda nie jest obecnie używana.
     * @return wartość ostatniego elementu na liście.
     */

    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    /**
     * Zwraca wartość ostatniego elementu na liście i usuwa go. Metoda nie jest obecnie używana.
     * @return wartość ostatniego elementu na liście.
     */

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Prywatna klasa wewnętrzna.
     * Każdy węzeł zawiera wartość całkowitą oraz wskaźniki do poprzedniego i następnego węzła na liście.
     */

    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Konstruktor nowego obiektu Node o wartości całkowitej.
         * @param i wartość nowego węzła.
         */

        public Node(int i) {
            value = i;
        }

        /**
         * Zwraca wartość węzła.
         * @return value wartość węzła.
         */

        public int getValue() {
            return value;
        }

        /**
         * Zwraca poprzedni węzeł.
         * @return prev poprzedni węzeł.
         */

        public Node getPrev() {
            return prev;
        }

        /**
         * Ustawia poprzedni węzeł.
         * @param prev poprzedni węzeł.
         */

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Zwraca następny węzeł.
         * @return next następny węzeł.
         */

        public Node getNext() {
            return next;
        }

        /**
         * Ustawia następny węzeł.
         * @param next następny węzeł.
         */

        public void setNext(Node next) {
            this.next = next;
        }
    }
}